# Проект "Домашние и Вьючные Друзья"

Этот проект представляет собой репозиторий для управления информацией о домашних и вьючных животных.

## Начало работы

Чтобы настроить проект, выполните следующие шаги:

```bash
sudo apt update
sudo apt install git

cd Desktop
mkdir pets_project
cd pets_project
touch README.md
git add README.md
git commit -m "Добавлен README.md"
git remote add origin https://github.com/danilshatalov/linux.git
git push -u origin main
```

## Управление информацией о животных

Используйте следующие команды для управления информацией о домашних и вьючных животных:
```bash
# Создание файлов с информацией о домашних и вьючных животных
cat > Pets.txt 
Собаки
Кошки
Хомяки

cat > PackAnimals.txt 
Лошади
Верблюды
Ослы

# Объединение информации в один файл
cat Pets.txt PackAnimals.txt > HumanFriends.txt

# Просмотр объединенной информации
cat HumanFriends.txt

# Переименование файла
mv HumanFriends.txt 'Human Friends.txt'
```
## Установка MySQL

Для установки MySQL выполните следующие команды:


```bash
sudo apt-get update
sudo apt-get install software-properties-common
sudo add-apt-repository -y 'deb http://archive.ubuntu.com/ubuntu focal universe'
sudo add-apt-repository -y 'deb http://archive.ubuntu.com/ubuntu focal main universe'
sudo apt-get update
sudo apt-get install mysql-server
sudo mysql_secure_installation
sudo systemctl start mysql
sudo systemctl status mysql
sudo mysql -u root -p
```
## Установка браузера Vivaldi

Для установки браузера Vivaldi используйте следующие команды:


```bash
# Установка
wget https://downloads.vivaldi.com/stable/vivaldi-stable_amd64.deb
sudo dpkg -i vivaldi-stable_amd64.deb
vivaldi-stable

# Удаление 
sudo dpkg -r vivaldi-stable
```
