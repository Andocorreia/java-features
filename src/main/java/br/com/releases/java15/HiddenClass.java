package br.com.releases.java15;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

//Explicação
// A classe HiddenClass demonstra o uso de classes ocultas no Java 15.
// Classes ocultas são uma nova funcionalidade que permite a criação de classes
// que não são visíveis para o sistema de tipos Java, mas podem ser usadas
// para encapsular lógica ou dados de forma segura.
public class HiddenClass {

    public void getHiddenClass() throws Throwable {
        MethodHandles. Lookup  lookup  = MethodHandles.lookup();
        // Exemplo de bytecode para uma classe
        // (Isso normalmente seria gerado ou carregado)

        byte [] classBytes = generateSampleClassBytes();
        // Vamos supor que este método nos dá bytecode

        // Defina uma classe oculta a partir do bytecode
        MethodHandles.Lookup hiddenClassLookup = lookup.defineHiddenClass(classBytes, true,
                MethodHandles.Lookup.ClassOption.NESTMATE);

        // Cria uma instância da classe oculta
        Object  hiddenInstance  = hiddenClassLookup.lookupClass()
                .getConstructor().newInstance();

        // Acessar um método da classe oculta
        MethodType methodType  = MethodType.methodType( void .class);
        hiddenClassLookup.findVirtual(hiddenClassLookup.lookupClass(), "sayHello" , methodType)
                .invoke(hiddenInstance);
    }

    private byte [] generateSampleClassBytes() {
        // Normalmente, isso geraria ou carregaria um bytecode válido para uma classe
        return  new  byte []{ /* bytecode válido aqui */ };
    }
}
