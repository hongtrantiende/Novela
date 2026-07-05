package defpackage;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF0 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i3e  reason: default package */
/* loaded from: classes.dex */
public final class i3e {
    public static final i3e c;
    public static final i3e d;
    public static final i3e e;
    public static final /* synthetic */ i3e[] f;
    public final j3e a;
    public final int b;
    /* JADX INFO: Fake field, exist only in values array */
    i3e EF1;
    /* JADX INFO: Fake field, exist only in values array */
    i3e EF2;
    /* JADX INFO: Fake field, exist only in values array */
    i3e EF0;

    static {
        i3e i3eVar = new i3e("DOUBLE", 0, j3e.d, 1);
        i3e i3eVar2 = new i3e("FLOAT", 1, j3e.c, 5);
        j3e j3eVar = j3e.b;
        i3e i3eVar3 = new i3e("INT64", 2, j3eVar, 0);
        i3e i3eVar4 = new i3e("UINT64", 3, j3eVar, 0);
        j3e j3eVar2 = j3e.a;
        i3e i3eVar5 = new i3e("INT32", 4, j3eVar2, 0);
        i3e i3eVar6 = new i3e("FIXED64", 5, j3eVar, 1);
        i3e i3eVar7 = new i3e("FIXED32", 6, j3eVar2, 5);
        i3e i3eVar8 = new i3e("BOOL", 7, j3e.e, 0);
        i3e i3eVar9 = new i3e("STRING", 8, j3e.f, 2);
        c = i3eVar9;
        j3e j3eVar3 = j3e.E;
        i3e i3eVar10 = new i3e("GROUP", 9, j3eVar3, 3);
        d = i3eVar10;
        i3e i3eVar11 = new i3e("MESSAGE", 10, j3eVar3, 2);
        e = i3eVar11;
        f = new i3e[]{i3eVar, i3eVar2, i3eVar3, i3eVar4, i3eVar5, i3eVar6, i3eVar7, i3eVar8, i3eVar9, i3eVar10, i3eVar11, new i3e("BYTES", 11, j3e.C, 2), new i3e("UINT32", 12, j3eVar2, 0), new i3e("ENUM", 13, j3e.D, 0), new i3e("SFIXED32", 14, j3eVar2, 5), new i3e("SFIXED64", 15, j3eVar, 1), new i3e("SINT32", 16, j3eVar2, 0), new i3e("SINT64", 17, j3eVar, 0)};
    }

    public i3e(String str, int i, j3e j3eVar, int i2) {
        this.a = j3eVar;
        this.b = i2;
    }

    public static i3e[] values() {
        return (i3e[]) f.clone();
    }
}
