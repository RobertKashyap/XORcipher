# XOR ENCRYPTION for text files 

Contents of the repositiory

# ~ raw.txt 
--> sample raw file input for encryption
# ~ encrypted.txt 
--> sample encrypted file
# ~ decrypted.txt 
--> sample decrypted file
# ~ manifest.mf 
--> manifest file to aid jar file
# ~ README.md 
--> you are here
# ~ XOREncryption.class 
--> executable class file -- to execute the file follow as below

	$cd XORcipher
	$java XOREncryption.class

# ~ XOREncryption.java 
--> source code file -- to recompile the file follow as below

	$cd XORcipher
	$javac XOREncryption.java

# ~ XOR.jar 
--> executable jar(java archive) file -- to execute the file follow as below
(double clicking on the jar also helps in windows enviroment usually in most machines)

	$cd XORcipher
	$java -jar XOR.jar	

 -- to reconstruct the file do as below

	$cd XORcipher
	$jar -cvmf manifest.mf XOR.jar XOREncryption.class
