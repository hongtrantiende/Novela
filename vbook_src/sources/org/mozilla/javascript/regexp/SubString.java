package org.mozilla.javascript.regexp;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class SubString {
    int index;
    int length;
    String str;

    public SubString(String str) {
        this.str = str;
        this.index = 0;
        this.length = str.length();
    }

    public String toString() {
        String str = this.str;
        if (str == null) {
            return "";
        }
        int i = this.index;
        return str.substring(i, this.length + i);
    }

    public SubString() {
    }

    public SubString(String str, int i, int i2) {
        this.str = str;
        this.index = i;
        this.length = i2;
    }
}
