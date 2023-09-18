package uniderp.poo.dominio;

public class App {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(
            13,                    
            "Boeing 747",          
            "747-300",             
            "Azul",              
            "XYZ123",              
            2022,                  
            2021,                  
            6,                     
            "Boeing Company",      
            400.0,                 
            "Querosene",           
            "Avião",               
            2,                     
            389,                   
            "PR",                  
            "Cascavel",           
            400,                   
            4,                     
            4                      
        );
    
        aviao.imprimir();

        Caminhao caminhao = new Caminhao(
            7,                     
            "Volvo",          
            "KLMD16 000",             
            "PRETO",              
            "OOH3564",              
            1999,                  
            1987,                  
            4,                     
            "Volvo",      
            6.0,                 
            "Diesel",           
            "Caminhão",               
            3,                     
            2,                   
            "MS",                  
            "CAMPO GRANDE",           
            3,                   
            2,                     
            "1234567890",
            "Fabiola de Melo",
            "CDE237KYZ"
        );

        caminhao.imprimir();

        Carro carro = new Carro(
            3,                     
            "Honda",          
            "Corola",             
            "Branco",              
            "KWB2790",              
            2023,                  
            2022,                  
            4,                     
            "Honda",      
            2.8,                 
            "Flex",           
            "Carro",               
            2,                     
            5,                   
            "MS",                  
            "Campo Grande",           
            "Sedan",                   
            5,                     
            5,                     
            "9876543210",
            "Karine Soares"
        );

        carro.imprimir();
        
        Motocicleta motocicleta = new Motocicleta(
            4,                     
            "Honda CB 500",          
            "CB 500X",             
            "Vermelha",              
            "KYL157",              
            2019,                  
            2017,                  
            2,                     
            "Honda",      
            150,                
            "Flex",           
            "Motocicleta",               
            2,                     
            2,                   
            "RJ",                  
            "COPACABANA",           
            "EBD125KYZ",
            "1236543210",
            "Kemylla Alves"
        );

        motocicleta.imprimir();


        Onibus onibus = new Onibus(
            5,                     
            "Mercedes-Benz",          
            "MB 1590",             
            "Verde",              
            "LMC789",              
            2015,                  
            2010,                  
            6,                     
            "Mercedes-Benz",      
            4.0,                 
            "Diesel",           
            "Ônibus",               
            3,                     
            45,                   
            "RJ",                  
            "Rio de Janeiro",           
            "ABC197YDZ",
            45,   
            3    
        );

        onibus.imprimir();
    }

    
}