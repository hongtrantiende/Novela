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
/* renamed from: gc4  reason: default package */
/* loaded from: classes.dex */
public final class gc4 {
    public static final gc4 b;
    public static final gc4 c;
    public static final gc4[] d;
    public static final /* synthetic */ gc4[] e;
    public final int a;
    /* JADX INFO: Fake field, exist only in values array */
    gc4 EF0;

    static {
        p26 p26Var = p26.DOUBLE;
        gc4 gc4Var = new gc4("DOUBLE", 0, 0, 1, p26Var);
        p26 p26Var2 = p26.FLOAT;
        gc4 gc4Var2 = new gc4("FLOAT", 1, 1, 1, p26Var2);
        p26 p26Var3 = p26.LONG;
        gc4 gc4Var3 = new gc4("INT64", 2, 2, 1, p26Var3);
        gc4 gc4Var4 = new gc4("UINT64", 3, 3, 1, p26Var3);
        p26 p26Var4 = p26.INT;
        gc4 gc4Var5 = new gc4("INT32", 4, 4, 1, p26Var4);
        gc4 gc4Var6 = new gc4("FIXED64", 5, 5, 1, p26Var3);
        gc4 gc4Var7 = new gc4("FIXED32", 6, 6, 1, p26Var4);
        p26 p26Var5 = p26.BOOLEAN;
        gc4 gc4Var8 = new gc4("BOOL", 7, 7, 1, p26Var5);
        p26 p26Var6 = p26.STRING;
        gc4 gc4Var9 = new gc4("STRING", 8, 8, 1, p26Var6);
        p26 p26Var7 = p26.MESSAGE;
        gc4 gc4Var10 = new gc4("MESSAGE", 9, 9, 1, p26Var7);
        p26 p26Var8 = p26.BYTE_STRING;
        gc4 gc4Var11 = new gc4("BYTES", 10, 10, 1, p26Var8);
        gc4 gc4Var12 = new gc4("UINT32", 11, 11, 1, p26Var4);
        p26 p26Var9 = p26.ENUM;
        gc4 gc4Var13 = new gc4("ENUM", 12, 12, 1, p26Var9);
        gc4 gc4Var14 = new gc4("SFIXED32", 13, 13, 1, p26Var4);
        gc4 gc4Var15 = new gc4("SFIXED64", 14, 14, 1, p26Var3);
        gc4 gc4Var16 = new gc4("SINT32", 15, 15, 1, p26Var4);
        gc4 gc4Var17 = new gc4("SINT64", 16, 16, 1, p26Var3);
        gc4 gc4Var18 = new gc4("GROUP", 17, 17, 1, p26Var7);
        gc4 gc4Var19 = new gc4("DOUBLE_LIST", 18, 18, 2, p26Var);
        gc4 gc4Var20 = new gc4("FLOAT_LIST", 19, 19, 2, p26Var2);
        gc4 gc4Var21 = new gc4("INT64_LIST", 20, 20, 2, p26Var3);
        gc4 gc4Var22 = new gc4("UINT64_LIST", 21, 21, 2, p26Var3);
        gc4 gc4Var23 = new gc4("INT32_LIST", 22, 22, 2, p26Var4);
        gc4 gc4Var24 = new gc4("FIXED64_LIST", 23, 23, 2, p26Var3);
        gc4 gc4Var25 = new gc4("FIXED32_LIST", 24, 24, 2, p26Var4);
        gc4 gc4Var26 = new gc4("BOOL_LIST", 25, 25, 2, p26Var5);
        gc4 gc4Var27 = new gc4("STRING_LIST", 26, 26, 2, p26Var6);
        gc4 gc4Var28 = new gc4("MESSAGE_LIST", 27, 27, 2, p26Var7);
        gc4 gc4Var29 = new gc4("BYTES_LIST", 28, 28, 2, p26Var8);
        gc4 gc4Var30 = new gc4("UINT32_LIST", 29, 29, 2, p26Var4);
        gc4 gc4Var31 = new gc4("ENUM_LIST", 30, 30, 2, p26Var9);
        gc4 gc4Var32 = new gc4("SFIXED32_LIST", 31, 31, 2, p26Var4);
        gc4 gc4Var33 = new gc4("SFIXED64_LIST", 32, 32, 2, p26Var3);
        gc4 gc4Var34 = new gc4("SINT32_LIST", 33, 33, 2, p26Var4);
        gc4 gc4Var35 = new gc4("SINT64_LIST", 34, 34, 2, p26Var3);
        gc4 gc4Var36 = new gc4("DOUBLE_LIST_PACKED", 35, 35, 3, p26Var);
        b = gc4Var36;
        gc4 gc4Var37 = new gc4("FLOAT_LIST_PACKED", 36, 36, 3, p26Var2);
        gc4 gc4Var38 = new gc4("INT64_LIST_PACKED", 37, 37, 3, p26Var3);
        gc4 gc4Var39 = new gc4("UINT64_LIST_PACKED", 38, 38, 3, p26Var3);
        gc4 gc4Var40 = new gc4("INT32_LIST_PACKED", 39, 39, 3, p26Var4);
        gc4 gc4Var41 = new gc4("FIXED64_LIST_PACKED", 40, 40, 3, p26Var3);
        gc4 gc4Var42 = new gc4("FIXED32_LIST_PACKED", 41, 41, 3, p26Var4);
        gc4 gc4Var43 = new gc4("BOOL_LIST_PACKED", 42, 42, 3, p26Var5);
        gc4 gc4Var44 = new gc4("UINT32_LIST_PACKED", 43, 43, 3, p26Var4);
        gc4 gc4Var45 = new gc4("ENUM_LIST_PACKED", 44, 44, 3, p26Var9);
        gc4 gc4Var46 = new gc4("SFIXED32_LIST_PACKED", 45, 45, 3, p26Var4);
        gc4 gc4Var47 = new gc4("SFIXED64_LIST_PACKED", 46, 46, 3, p26Var3);
        gc4 gc4Var48 = new gc4("SINT32_LIST_PACKED", 47, 47, 3, p26Var4);
        gc4 gc4Var49 = new gc4("SINT64_LIST_PACKED", 48, 48, 3, p26Var3);
        c = gc4Var49;
        e = new gc4[]{gc4Var, gc4Var2, gc4Var3, gc4Var4, gc4Var5, gc4Var6, gc4Var7, gc4Var8, gc4Var9, gc4Var10, gc4Var11, gc4Var12, gc4Var13, gc4Var14, gc4Var15, gc4Var16, gc4Var17, gc4Var18, gc4Var19, gc4Var20, gc4Var21, gc4Var22, gc4Var23, gc4Var24, gc4Var25, gc4Var26, gc4Var27, gc4Var28, gc4Var29, gc4Var30, gc4Var31, gc4Var32, gc4Var33, gc4Var34, gc4Var35, gc4Var36, gc4Var37, gc4Var38, gc4Var39, gc4Var40, gc4Var41, gc4Var42, gc4Var43, gc4Var44, gc4Var45, gc4Var46, gc4Var47, gc4Var48, gc4Var49, new gc4("GROUP_LIST", 49, 49, 2, p26Var7), new gc4("MAP", 50, 50, 4, p26.VOID)};
        gc4[] values = values();
        d = new gc4[values.length];
        for (gc4 gc4Var50 : values) {
            d[gc4Var50.a] = gc4Var50;
        }
    }

    public gc4(String str, int i, int i2, int i3, p26 p26Var) {
        this.a = i2;
        int C = a82.C(i3);
        if (C != 1) {
            if (C == 3) {
                p26Var.getClass();
            }
        } else {
            p26Var.getClass();
        }
        if (i3 == 1) {
            p26Var.ordinal();
        }
    }

    public static gc4 valueOf(String str) {
        return (gc4) Enum.valueOf(gc4.class, str);
    }

    public static gc4[] values() {
        return (gc4[]) e.clone();
    }
}
