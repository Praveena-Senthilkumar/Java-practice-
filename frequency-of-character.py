def frequency(string):
    freq = {}
    
    for ch in string:
        if ch in freq:
            freq[ch] += 1
        else:
            freq[ch] = 1
            
    for ch, count in freq.items():
        print(f"{ch}: {count}")

string = input("Enter a string: ")
frequency(string)

