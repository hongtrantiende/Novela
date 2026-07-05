package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sjf  reason: default package */
/* loaded from: classes.dex */
public class sjf {
    public final String a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public sjf(String str, Class cls, boolean z, boolean z2) {
        char charAt = str.charAt(0);
        if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
            for (int i = 1; i < str.length(); i++) {
                char charAt2 = str.charAt(i);
                if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                    vs.m("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                    throw null;
                }
            }
            this.a = str;
            this.b = cls;
            this.c = z;
            this.d = z2;
            int identityHashCode = System.identityHashCode(this);
            long j = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                j |= 1 << (identityHashCode & 63);
                identityHashCode >>>= 6;
            }
            this.e = j;
            return;
        }
        vs.m("identifier must start with an ASCII letter: ".concat(str));
        throw null;
    }

    public void a(Iterator it, vkf vkfVar) {
        while (it.hasNext()) {
            b(it.next(), vkfVar);
        }
    }

    public void b(Object obj, vkf vkfVar) {
        vkfVar.a(obj, this.a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        nk2.C(sb, name, "/", str, "[");
        return s21.q(sb, name2, "]");
    }
}
