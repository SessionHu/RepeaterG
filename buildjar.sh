echo -e "Processing files from last build..."
rm -r build/
mkdir build/

echo -e "Building..."
javac -d build/ RepeaterG.java

echo -e "Packing..."
cp ./README.md ./LICENSE build/
cd build/
jar -cvfm 'RepeaterG.jar' ../manifest -C ./ .

cd ..
