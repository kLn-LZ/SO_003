package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DistroController {

    public DistroController() {

        super();
    }

    private String os() {

        String os = System.getProperty("os.name");

        return os;


    }


    public void exibeDistro() throws IOException {


        String vOs = os();

        if (vOs.contains("Windows")) {

            System.out.println("Ferramenta disponível apenas no sistema operacional Linux");


        }

        else if(vOs.contains("Linux")) {

            try {
                Process p = Runtime.getRuntime().exec("cat /etc/os-release");
                InputStream fluxo = p.getInputStream();
                InputStreamReader leitor = new InputStreamReader(fluxo);

                BufferedReader buffer = new BufferedReader(leitor);
                String linha = buffer.readLine();

                while (linha != null) {


                    System.out.println(linha);


                    linha = buffer.readLine();

                }

                buffer.close();
                leitor.close();
                fluxo.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

    }

}
