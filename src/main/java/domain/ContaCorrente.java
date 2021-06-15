package domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
public class ContaCorrente {

    @Id
    @GeneratedValue
    private Long id;
    private Integer numero;
    private Double saldo;
    @ManyToOne
    private Cliente titular;

    public Boolean sacar(Double valor){

        Double saldo = getSaldo();

        if(saldo >= valor){
            setSaldo(saldo - valor);
            return true;
        }
        else{
            throw new IllegalArgumentException("A conta corrente não possui saldo suficiente para efetuar o saque!");
        }
    }

    public Boolean depositar(Double valor){

        Double saldo = getSaldo();
        setSaldo(saldo + valor);

        return true;
    }
}
