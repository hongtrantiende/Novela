package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tc7  reason: default package */
/* loaded from: classes3.dex */
public final class tc7 extends v9a {
    public final List a;
    public final String b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tc7(String str, String str2) {
        this(hl5.o("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null, tl1.A(str), str2);
        str2.getClass();
    }

    public tc7(String str, tc7 tc7Var, List list, String str2) {
        super(str, tc7Var);
        this.a = list;
        this.b = str2;
    }
}
