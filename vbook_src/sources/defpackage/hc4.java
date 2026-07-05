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
/* renamed from: hc4  reason: default package */
/* loaded from: classes.dex */
public final class hc4 {
    public static final hc4 b;
    public static final hc4 c;
    public static final hc4[] d;
    public static final /* synthetic */ hc4[] e;
    public final int a;
    /* JADX INFO: Fake field, exist only in values array */
    hc4 EF0;

    static {
        q26 q26Var = q26.DOUBLE;
        hc4 hc4Var = new hc4("DOUBLE", 0, 0, 1, q26Var);
        q26 q26Var2 = q26.FLOAT;
        hc4 hc4Var2 = new hc4("FLOAT", 1, 1, 1, q26Var2);
        q26 q26Var3 = q26.LONG;
        hc4 hc4Var3 = new hc4("INT64", 2, 2, 1, q26Var3);
        hc4 hc4Var4 = new hc4("UINT64", 3, 3, 1, q26Var3);
        q26 q26Var4 = q26.INT;
        hc4 hc4Var5 = new hc4("INT32", 4, 4, 1, q26Var4);
        hc4 hc4Var6 = new hc4("FIXED64", 5, 5, 1, q26Var3);
        hc4 hc4Var7 = new hc4("FIXED32", 6, 6, 1, q26Var4);
        q26 q26Var5 = q26.BOOLEAN;
        hc4 hc4Var8 = new hc4("BOOL", 7, 7, 1, q26Var5);
        q26 q26Var6 = q26.STRING;
        hc4 hc4Var9 = new hc4("STRING", 8, 8, 1, q26Var6);
        q26 q26Var7 = q26.MESSAGE;
        hc4 hc4Var10 = new hc4("MESSAGE", 9, 9, 1, q26Var7);
        q26 q26Var8 = q26.BYTE_STRING;
        hc4 hc4Var11 = new hc4("BYTES", 10, 10, 1, q26Var8);
        hc4 hc4Var12 = new hc4("UINT32", 11, 11, 1, q26Var4);
        q26 q26Var9 = q26.ENUM;
        hc4 hc4Var13 = new hc4("ENUM", 12, 12, 1, q26Var9);
        hc4 hc4Var14 = new hc4("SFIXED32", 13, 13, 1, q26Var4);
        hc4 hc4Var15 = new hc4("SFIXED64", 14, 14, 1, q26Var3);
        hc4 hc4Var16 = new hc4("SINT32", 15, 15, 1, q26Var4);
        hc4 hc4Var17 = new hc4("SINT64", 16, 16, 1, q26Var3);
        hc4 hc4Var18 = new hc4("GROUP", 17, 17, 1, q26Var7);
        hc4 hc4Var19 = new hc4("DOUBLE_LIST", 18, 18, 2, q26Var);
        hc4 hc4Var20 = new hc4("FLOAT_LIST", 19, 19, 2, q26Var2);
        hc4 hc4Var21 = new hc4("INT64_LIST", 20, 20, 2, q26Var3);
        hc4 hc4Var22 = new hc4("UINT64_LIST", 21, 21, 2, q26Var3);
        hc4 hc4Var23 = new hc4("INT32_LIST", 22, 22, 2, q26Var4);
        hc4 hc4Var24 = new hc4("FIXED64_LIST", 23, 23, 2, q26Var3);
        hc4 hc4Var25 = new hc4("FIXED32_LIST", 24, 24, 2, q26Var4);
        hc4 hc4Var26 = new hc4("BOOL_LIST", 25, 25, 2, q26Var5);
        hc4 hc4Var27 = new hc4("STRING_LIST", 26, 26, 2, q26Var6);
        hc4 hc4Var28 = new hc4("MESSAGE_LIST", 27, 27, 2, q26Var7);
        hc4 hc4Var29 = new hc4("BYTES_LIST", 28, 28, 2, q26Var8);
        hc4 hc4Var30 = new hc4("UINT32_LIST", 29, 29, 2, q26Var4);
        hc4 hc4Var31 = new hc4("ENUM_LIST", 30, 30, 2, q26Var9);
        hc4 hc4Var32 = new hc4("SFIXED32_LIST", 31, 31, 2, q26Var4);
        hc4 hc4Var33 = new hc4("SFIXED64_LIST", 32, 32, 2, q26Var3);
        hc4 hc4Var34 = new hc4("SINT32_LIST", 33, 33, 2, q26Var4);
        hc4 hc4Var35 = new hc4("SINT64_LIST", 34, 34, 2, q26Var3);
        hc4 hc4Var36 = new hc4("DOUBLE_LIST_PACKED", 35, 35, 3, q26Var);
        b = hc4Var36;
        hc4 hc4Var37 = new hc4("FLOAT_LIST_PACKED", 36, 36, 3, q26Var2);
        hc4 hc4Var38 = new hc4("INT64_LIST_PACKED", 37, 37, 3, q26Var3);
        hc4 hc4Var39 = new hc4("UINT64_LIST_PACKED", 38, 38, 3, q26Var3);
        hc4 hc4Var40 = new hc4("INT32_LIST_PACKED", 39, 39, 3, q26Var4);
        hc4 hc4Var41 = new hc4("FIXED64_LIST_PACKED", 40, 40, 3, q26Var3);
        hc4 hc4Var42 = new hc4("FIXED32_LIST_PACKED", 41, 41, 3, q26Var4);
        hc4 hc4Var43 = new hc4("BOOL_LIST_PACKED", 42, 42, 3, q26Var5);
        hc4 hc4Var44 = new hc4("UINT32_LIST_PACKED", 43, 43, 3, q26Var4);
        hc4 hc4Var45 = new hc4("ENUM_LIST_PACKED", 44, 44, 3, q26Var9);
        hc4 hc4Var46 = new hc4("SFIXED32_LIST_PACKED", 45, 45, 3, q26Var4);
        hc4 hc4Var47 = new hc4("SFIXED64_LIST_PACKED", 46, 46, 3, q26Var3);
        hc4 hc4Var48 = new hc4("SINT32_LIST_PACKED", 47, 47, 3, q26Var4);
        hc4 hc4Var49 = new hc4("SINT64_LIST_PACKED", 48, 48, 3, q26Var3);
        c = hc4Var49;
        e = new hc4[]{hc4Var, hc4Var2, hc4Var3, hc4Var4, hc4Var5, hc4Var6, hc4Var7, hc4Var8, hc4Var9, hc4Var10, hc4Var11, hc4Var12, hc4Var13, hc4Var14, hc4Var15, hc4Var16, hc4Var17, hc4Var18, hc4Var19, hc4Var20, hc4Var21, hc4Var22, hc4Var23, hc4Var24, hc4Var25, hc4Var26, hc4Var27, hc4Var28, hc4Var29, hc4Var30, hc4Var31, hc4Var32, hc4Var33, hc4Var34, hc4Var35, hc4Var36, hc4Var37, hc4Var38, hc4Var39, hc4Var40, hc4Var41, hc4Var42, hc4Var43, hc4Var44, hc4Var45, hc4Var46, hc4Var47, hc4Var48, hc4Var49, new hc4("GROUP_LIST", 49, 49, 2, q26Var7), new hc4("MAP", 50, 50, 4, q26.VOID)};
        hc4[] values = values();
        d = new hc4[values.length];
        for (hc4 hc4Var50 : values) {
            d[hc4Var50.a] = hc4Var50;
        }
    }

    public hc4(String str, int i, int i2, int i3, q26 q26Var) {
        this.a = i2;
        int C = a82.C(i3);
        if (C != 1) {
            if (C == 3) {
                q26Var.getClass();
            }
        } else {
            q26Var.getClass();
        }
        if (i3 == 1) {
            q26Var.ordinal();
        }
    }

    public static hc4 valueOf(String str) {
        return (hc4) Enum.valueOf(hc4.class, str);
    }

    public static hc4[] values() {
        return (hc4[]) e.clone();
    }
}
