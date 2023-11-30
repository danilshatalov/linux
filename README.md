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
___

## Диаграмма классов Pets и Pack animals

![Image alt](https://github.com/danilshatalov/linux/blob/main/diagram.jpg)

# Приложение "Реестр Животных"

Приложение "Реестр Животных" - это простое консольное приложение на Java, которое моделирует реестр животных с различными типами, такими как домашние питомцы и пак-животные.

## Возможности

1. **Добавление Нового Животного:**
   - Добавляйте новых животных в реестр, указывая их тип (например, собака, кошка, хомяк, лошадь, верблюд, осел).

2. **Список Команд:**
   - Просматривайте список команд, которые может выполнить домашний питомец.

3. **Обучение Новым Командам:**
   - Обучайте домашних питомцев новым командам.

4. **Список по Дате Рождения:**
   - Просматривайте список животных по их дате рождения.

## Как Запустить

1. **Компиляция:**
   ```bash
   javac *.java
   ```
2. **Запуск приложения:**
   ```bash
   java AnimalRegistryApp
   ```



