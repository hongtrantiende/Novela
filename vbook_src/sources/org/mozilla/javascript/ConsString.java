package org.mozilla.javascript;

import java.io.Serializable;
import java.util.ArrayDeque;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class ConsString implements CharSequence, Serializable {
    private static final long serialVersionUID = -8432806714471372570L;
    private boolean isFlat;
    private CharSequence left;
    private final int length;
    private CharSequence right;

    public ConsString(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence instanceof String) && !(charSequence instanceof ConsString)) {
            charSequence = charSequence.toString();
        }
        if (!(charSequence2 instanceof String) && !(charSequence2 instanceof ConsString)) {
            charSequence2 = charSequence2.toString();
        }
        this.left = charSequence;
        this.right = charSequence2;
        this.length = this.right.length() + charSequence.length();
        this.isFlat = false;
    }

    private synchronized String flatten() {
        try {
            if (!this.isFlat) {
                int i = this.length;
                char[] cArr = new char[i];
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.addFirst(this.left);
                CharSequence charSequence = this.right;
                do {
                    if (charSequence instanceof ConsString) {
                        ConsString consString = (ConsString) charSequence;
                        boolean z = consString.isFlat;
                        CharSequence charSequence2 = consString.left;
                        if (z) {
                            charSequence = charSequence2;
                        } else {
                            arrayDeque.addFirst(charSequence2);
                            charSequence = consString.right;
                            continue;
                        }
                    }
                    String str = (String) charSequence;
                    i -= str.length();
                    str.getChars(0, str.length(), cArr, i);
                    if (arrayDeque.isEmpty()) {
                        charSequence = null;
                        continue;
                    } else {
                        charSequence = (CharSequence) arrayDeque.removeFirst();
                        continue;
                    }
                } while (charSequence != null);
                this.left = new String(cArr);
                this.right = "";
                this.isFlat = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.left;
    }

    private Object writeReplace() {
        return toString();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        String flatten;
        if (this.isFlat) {
            flatten = (String) this.left;
        } else {
            flatten = flatten();
        }
        return flatten.charAt(i);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        String flatten;
        if (this.isFlat) {
            flatten = (String) this.left;
        } else {
            flatten = flatten();
        }
        return flatten.substring(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        if (this.isFlat) {
            return (String) this.left;
        }
        return flatten();
    }
}
