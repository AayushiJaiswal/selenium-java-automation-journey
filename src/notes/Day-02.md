
# Day 02 — Selenium Locators

## 1. What are Locators?
Locators are used by Selenium to identify web elements on a webpage such as input fields, buttons, links, headings and more.

## 2. Locator Types

### ID
Finds an element using its id attribute.

```java
driver.findElement(By.id("username"));
```

### Name
Finds an element using its name attribute.

```java
driver.findElement(By.name("username"));
```

### Class Name
Finds an element using its class attribute. Use a single class name.

```java
driver.findElement(By.className("radius"));
```

### Link Text
Finds a link using its complete visible text.

```java
driver.findElement(By.linkText("Form Authentication"));
```

### Partial Link Text
Finds a link using part of its visible text.

```java
driver.findElement(By.partialLinkText("Form"));
```

### Tag Name
Finds elements by HTML tag.

```java
driver.findElement(By.tagName("h2"));
```

### CSS Selector
CSS selectors are used to identify elements through CSS-style patterns.

Examples:

```java
#username
.radius
h2
input[name='username']
button[type='submit']
button.radius
input#username
input[type='password'][name='password']
#login button
```

Java:

```java
driver.findElement(By.cssSelector("input#username"));
```

### XPath
XPath can identify elements through HTML attributes, text and relationships.

Attribute:

```xpath
//input[@id='username']
```

Multiple conditions:

```xpath
//input[@id='username' and @name='username']
```

Text:

```xpath
//button[text()='Login']
```

Contains:

```xpath
//button[contains(@class,'radius')]
```

Partial text:

```xpath
//a[contains(text(),'Form')]
```

Starts with:

```xpath
//input[starts-with(@id,'user_login')]
```

## 3. XPath Relationships

Direct child:

```xpath
//div[@id='login']/form/input
```

Parent:

```xpath
//input[@id='username']/..
```

Following sibling:

```xpath
//input[@id='username']/following-sibling::input
```

Preceding sibling:

```xpath
//button/preceding-sibling::input
```

### Difference between / and //

- `/` = direct child relationship
- `//` = descendant at any depth

## 4. Common Selenium Exception

### NoSuchElementException

Occurs when Selenium cannot locate the requested element.

Possible reasons:

- Incorrect locator
- Wrong HTML tag
- Element not loaded yet
- Element inside an iframe
- Element does not exist on the page

Debugging approach:

1. Inspect the element in browser DevTools.
2. Verify its tag and attributes.
3. Verify the locator.
4. Check whether the element is loaded.
5. Check if the element is inside an iframe.

## 5. Practical Website

Website: https://the-internet.herokuapp.com/

Practice page: Form Authentication

Username: tomsmith

Password: SuperSecretPassword!

## 6. What I Learned

- How to identify web elements.
- How to use different Selenium locator strategies.
- How to use CSS selectors.
- How to write basic XPath expressions.
- How to locate elements using text.
- How to use XPath relationships.
- How to debug NoSuchElementException.
- Why relative XPath is generally preferred over brittle absolute XPath.

## 7. Interview Questions

1. What is a locator in Selenium?
2. How many locator strategies does Selenium WebDriver support?
3. What is the difference between ID and Name?
4. What is the difference between CSS Selector and XPath?
5. What is the difference between absolute XPath and relative XPath?
6. What is the difference between / and // in XPath?
7. What is XPath contains()?
8. What is XPath starts-with()?
9. What is NoSuchElementException?
10. Why is By.className() unable to accept multiple space-separated class names?
