package defpackage;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rxa  reason: default package */
/* loaded from: classes3.dex */
public final class rxa {
    public static final rxa e;
    public static final /* synthetic */ rxa[] f;
    public final lf4 a;
    public final lf4 b;
    public final lf4 c;
    public final lf4 d;

    static {
        gxa v = tte.v(0.5f, 200.0f, 4, null);
        gxa v2 = tte.v(0.5f, 200.0f, 4, null);
        rk9 rk9Var = qed.a;
        rxa rxaVar = new rxa("Bounce", 0, v, v2, new gxa(0.5f, 200.0f, new py5(4294967297L)), new gxa(0.5f, 200.0f, new py5(4294967297L)));
        e = rxaVar;
        rd2 rd2Var = on3.a;
        f = new rxa[]{rxaVar, new rxa("Slide", 1, new arc(100, 0, rd2Var), new arc(100, 0, rd2Var), new arc(100, 0, rd2Var), new arc(100, 0, rd2Var))};
    }

    public rxa(String str, int i, lf4 lf4Var, lf4 lf4Var2, lf4 lf4Var3, lf4 lf4Var4) {
        this.a = lf4Var;
        this.b = lf4Var2;
        this.c = lf4Var3;
        this.d = lf4Var4;
    }

    public static rxa valueOf(String str) {
        return (rxa) Enum.valueOf(rxa.class, str);
    }

    public static rxa[] values() {
        return (rxa[]) f.clone();
    }
}
