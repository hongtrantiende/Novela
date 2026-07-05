package defpackage;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF2 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fld  reason: default package */
/* loaded from: classes.dex */
public class fld {
    public static final xkd c;
    public static final zkd d;
    public static final bld e;
    public static final /* synthetic */ fld[] f;
    public final hld a;
    public final int b;
    /* JADX INFO: Fake field, exist only in values array */
    fld EF0;
    /* JADX INFO: Fake field, exist only in values array */
    fld EF1;
    /* JADX INFO: Fake field, exist only in values array */
    fld EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [bld, fld] */
    /* JADX WARN: Type inference failed for: r4v2, types: [xkd, fld] */
    /* JADX WARN: Type inference failed for: r6v3, types: [zkd, fld] */
    static {
        fld fldVar = new fld("DOUBLE", 0, hld.DOUBLE, 1);
        fld fldVar2 = new fld("FLOAT", 1, hld.FLOAT, 5);
        hld hldVar = hld.LONG;
        fld fldVar3 = new fld("INT64", 2, hldVar, 0);
        fld fldVar4 = new fld("UINT64", 3, hldVar, 0);
        hld hldVar2 = hld.INT;
        fld fldVar5 = new fld("INT32", 4, hldVar2, 0);
        fld fldVar6 = new fld("FIXED64", 5, hldVar, 1);
        fld fldVar7 = new fld("FIXED32", 6, hldVar2, 5);
        fld fldVar8 = new fld("BOOL", 7, hld.BOOLEAN, 0);
        ?? fldVar9 = new fld("STRING", 8, hld.STRING, 2);
        c = fldVar9;
        hld hldVar3 = hld.MESSAGE;
        ?? fldVar10 = new fld("GROUP", 9, hldVar3, 3);
        d = fldVar10;
        ?? fldVar11 = new fld("MESSAGE", 10, hldVar3, 2);
        e = fldVar11;
        f = new fld[]{fldVar, fldVar2, fldVar3, fldVar4, fldVar5, fldVar6, fldVar7, fldVar8, fldVar9, fldVar10, fldVar11, new fld("BYTES", 11, hld.BYTE_STRING, 2), new fld("UINT32", 12, hldVar2, 0), new fld("ENUM", 13, hld.ENUM, 0), new fld("SFIXED32", 14, hldVar2, 5), new fld("SFIXED64", 15, hldVar, 1), new fld("SINT32", 16, hldVar2, 0), new fld("SINT64", 17, hldVar, 0)};
    }

    public fld(String str, int i, hld hldVar, int i2) {
        this.a = hldVar;
        this.b = i2;
    }

    public static fld valueOf(String str) {
        return (fld) Enum.valueOf(fld.class, str);
    }

    public static fld[] values() {
        return (fld[]) f.clone();
    }
}
