package com.google.mlkit.nl.languageid;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class IdentifiedLanguage {
    public final String a;
    public final float b;

    public IdentifiedLanguage(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdentifiedLanguage) {
                IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                if (Float.compare(identifiedLanguage.b, this.b) == 0) {
                    String str = identifiedLanguage.a;
                    String str2 = this.a;
                    if (str2 != str) {
                        if (str2 != null && str2.equals(str)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        yx9 yx9Var = new yx9("IdentifiedLanguage", 29);
        yx9 yx9Var2 = new yx9((char) 0, 26);
        ((yx9) yx9Var.d).d = yx9Var2;
        yx9Var.d = yx9Var2;
        yx9Var2.b = this.a;
        yx9Var2.c = "languageTag";
        String valueOf = String.valueOf(this.b);
        yx9 yx9Var3 = new yx9((char) 0, 26);
        ((yx9) yx9Var.d).d = yx9Var3;
        yx9Var.d = yx9Var3;
        yx9Var3.b = valueOf;
        yx9Var3.c = "confidence";
        return yx9Var.toString();
    }
}
