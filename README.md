# XOR ENCRYPTION for text files 

Contents of the repositiory

1. raw.txt --> sample raw file input for encryption
2. encrypted.txt --> sample encrypted file
3. decrypted.txt --> sample decrypted file
4. manifest.mf --> manifest file to aid jar file
5. README.md --> you are here
6. XOREncryption.class --> executable class file -- to execute the file follow as below

	$cd XORcipher
	$java XOREncryption.class

7. XOREncryption.java --> source code file -- to recompile the file follow as below

	$cd XORcipher
	$javac XOREncryption.java

8. XOR.jar --> executable jar(java archive) file -- to execute the file follow as below
(double clicking on the jar also helps in windows enviroment usually in most machines)

	$cd XORcipher
	$java -jar XOR.jar	

 -- to reconstruct the file do as below
												 
	$cd XORcipher
	$jar -cvmf manifest.mf XOR.jar XOREncryption.class
