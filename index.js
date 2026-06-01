//Check If Two Strings Are Anagrams

/*
Two strings are called anagrams if they contain
✔️ the same characters
✔️ with the same frequency
✔️ but in a different order

Example:
1. listen and silent ==>true
2. hello and world  == false
*/

// function checkAnagram(str1, str2) {
//   if (str1.length !== str2.length) {
//     return false;
//   }
//   let sorted1 = str1.split("").sort().join("");
//   let sorted2 = str2.split("").sort().join("");

//   return sorted1 == sorted2;
// }
// console.log(checkAnagram("hello", "world"));

//tc = O(nlog(n)) ===>O(n)

function checkAnagram(str1, str2) {
  if (str1.length !== str2.length) {
    return false;
  }
  let count = {};

  for (let char of str1) {
    if ((count[char] === count[char] || 0) + 1) {
    }
  }
}
