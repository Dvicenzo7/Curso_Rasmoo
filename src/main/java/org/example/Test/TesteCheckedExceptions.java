package org.example.Test;

import java.io.FileNotFoundException;

public class TesteCheckedExceptions {
    public static void main(String[] args) {
        try {
            exemploChecked();
        }catch (FileNotFoundException e){
            System.out.println("Deu ruim!" + e.getMessage());
        }
    }

    //Para compilar precisa colocar a assinatura, no metodo que chamou precisa ter um try-catch ou assinatura no metodo
    public static void exemploChecked() throws FileNotFoundException {
        throw new FileNotFoundException("Segura o erro que chamou o metodo!");
    }

    public static void exemploUnchecked(){
        throw new RuntimeException("Deu ruim! RuntimeException.");
    }
}
