def rev_sent(sent):
    s2 = ""
    space_mark = len(sent)
    for i in range(len(sent)-1,-1,-1):
        if sent[i] == " ":
            s2 += sent[i:space_mark]
            space_mark = i
    s2 += " " + sent[:space_mark]
    return s2

def rev_in_place(sent):
    sent = list(sent)
    size = len(sent)

    for i,j in zip(range(int(size/2)),range(size-1,int(size/2-1),-1)):
        sent[i], sent[j] = sent[j], sent[i]

    space_mark = -1
    for i in range(size):
        if sent[i] == " ":
            j = space_mark+1
            k = i-1
            while k > j:
                sent[j], sent[k] = sent[k], sent[j]
                j += 1
                k -= 1
            space_mark = i
    return sent

