package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l6d  reason: default package */
/* loaded from: classes3.dex */
public enum l6d {
    READ("rb", false, Token.IMPORT),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE("r+b", true, 120),
    APPEND("a+b", true, 88),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_OR_TRUNCATE("w+b", true, Token.ASSIGN_MOD),
    CREATE("w+b", true, 120),
    CREATE_NEW("w+b", true, Token.IMPORT);
    
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    l6d(String str, boolean z, int i) {
        boolean z2;
        boolean z3;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z4 = (i & 32) == 0;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }
}
