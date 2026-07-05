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
/* renamed from: eld  reason: default package */
/* loaded from: classes.dex */
public class eld {
    public static final wkd b;
    public static final ald c;
    public static final /* synthetic */ eld[] d;
    public final gld a;
    /* JADX INFO: Fake field, exist only in values array */
    eld EF0;
    /* JADX INFO: Fake field, exist only in values array */
    eld EF1;
    /* JADX INFO: Fake field, exist only in values array */
    eld EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [ald, eld] */
    /* JADX WARN: Type inference failed for: r4v2, types: [wkd, eld] */
    static {
        eld eldVar = new eld("DOUBLE", 0, gld.DOUBLE, 1);
        eld eldVar2 = new eld("FLOAT", 1, gld.FLOAT, 5);
        gld gldVar = gld.LONG;
        eld eldVar3 = new eld("INT64", 2, gldVar, 0);
        eld eldVar4 = new eld("UINT64", 3, gldVar, 0);
        gld gldVar2 = gld.INT;
        eld eldVar5 = new eld("INT32", 4, gldVar2, 0);
        eld eldVar6 = new eld("FIXED64", 5, gldVar, 1);
        eld eldVar7 = new eld("FIXED32", 6, gldVar2, 5);
        eld eldVar8 = new eld("BOOL", 7, gld.BOOLEAN, 0);
        ?? eldVar9 = new eld("STRING", 8, gld.STRING, 2);
        b = eldVar9;
        gld gldVar3 = gld.MESSAGE;
        eld eldVar10 = new eld("GROUP", 9, gldVar3, 3);
        ?? eldVar11 = new eld("MESSAGE", 10, gldVar3, 2);
        c = eldVar11;
        d = new eld[]{eldVar, eldVar2, eldVar3, eldVar4, eldVar5, eldVar6, eldVar7, eldVar8, eldVar9, eldVar10, eldVar11, new eld("BYTES", 11, gld.BYTE_STRING, 2), new eld("UINT32", 12, gldVar2, 0), new eld("ENUM", 13, gld.ENUM, 0), new eld("SFIXED32", 14, gldVar2, 5), new eld("SFIXED64", 15, gldVar, 1), new eld("SINT32", 16, gldVar2, 0), new eld("SINT64", 17, gldVar, 0)};
    }

    public eld(String str, int i, gld gldVar, int i2) {
        this.a = gldVar;
    }

    public static eld valueOf(String str) {
        return (eld) Enum.valueOf(eld.class, str);
    }

    public static eld[] values() {
        return (eld[]) d.clone();
    }
}
