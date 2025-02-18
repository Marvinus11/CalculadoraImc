# Windows | CMD
- cd ".\local_de_download"
  
### Compilação
- javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls CalculadoraImc.java
  ### OU
- javac --module-path "C:\Users\'user'\'local_de_download'" --add-modules javafx.controls CalculadoraImc.java

### Execução
- java --module-path "%PATH_TO_FX%" --add-modules javafx.controls CalculadoraImc
  ### OU
- java --module-path "C:\Users\'user'\'local_de_download'" --add-modules javafx.controls CalculadoraImc
