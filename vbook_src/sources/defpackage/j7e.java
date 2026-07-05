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
/* renamed from: j7e  reason: default package */
/* loaded from: classes.dex */
public final class j7e {
    public static final j7e b;
    public static final j7e c;
    public static final j7e[] d;
    public static final /* synthetic */ j7e[] e;
    public final int a;
    /* JADX INFO: Fake field, exist only in values array */
    j7e EF0;

    static {
        x7e x7eVar = x7e.e;
        j7e j7eVar = new j7e("DOUBLE", 0, 0, 1, x7eVar);
        x7e x7eVar2 = x7e.d;
        j7e j7eVar2 = new j7e("FLOAT", 1, 1, 1, x7eVar2);
        x7e x7eVar3 = x7e.c;
        j7e j7eVar3 = new j7e("INT64", 2, 2, 1, x7eVar3);
        j7e j7eVar4 = new j7e("UINT64", 3, 3, 1, x7eVar3);
        x7e x7eVar4 = x7e.b;
        j7e j7eVar5 = new j7e("INT32", 4, 4, 1, x7eVar4);
        j7e j7eVar6 = new j7e("FIXED64", 5, 5, 1, x7eVar3);
        j7e j7eVar7 = new j7e("FIXED32", 6, 6, 1, x7eVar4);
        x7e x7eVar5 = x7e.f;
        j7e j7eVar8 = new j7e("BOOL", 7, 7, 1, x7eVar5);
        x7e x7eVar6 = x7e.C;
        j7e j7eVar9 = new j7e("STRING", 8, 8, 1, x7eVar6);
        x7e x7eVar7 = x7e.F;
        j7e j7eVar10 = new j7e("MESSAGE", 9, 9, 1, x7eVar7);
        x7e x7eVar8 = x7e.D;
        j7e j7eVar11 = new j7e("BYTES", 10, 10, 1, x7eVar8);
        j7e j7eVar12 = new j7e("UINT32", 11, 11, 1, x7eVar4);
        x7e x7eVar9 = x7e.E;
        j7e j7eVar13 = new j7e("ENUM", 12, 12, 1, x7eVar9);
        j7e j7eVar14 = new j7e("SFIXED32", 13, 13, 1, x7eVar4);
        j7e j7eVar15 = new j7e("SFIXED64", 14, 14, 1, x7eVar3);
        j7e j7eVar16 = new j7e("SINT32", 15, 15, 1, x7eVar4);
        j7e j7eVar17 = new j7e("SINT64", 16, 16, 1, x7eVar3);
        j7e j7eVar18 = new j7e("GROUP", 17, 17, 1, x7eVar7);
        j7e j7eVar19 = new j7e("DOUBLE_LIST", 18, 18, 2, x7eVar);
        j7e j7eVar20 = new j7e("FLOAT_LIST", 19, 19, 2, x7eVar2);
        j7e j7eVar21 = new j7e("INT64_LIST", 20, 20, 2, x7eVar3);
        j7e j7eVar22 = new j7e("UINT64_LIST", 21, 21, 2, x7eVar3);
        j7e j7eVar23 = new j7e("INT32_LIST", 22, 22, 2, x7eVar4);
        j7e j7eVar24 = new j7e("FIXED64_LIST", 23, 23, 2, x7eVar3);
        j7e j7eVar25 = new j7e("FIXED32_LIST", 24, 24, 2, x7eVar4);
        j7e j7eVar26 = new j7e("BOOL_LIST", 25, 25, 2, x7eVar5);
        j7e j7eVar27 = new j7e("STRING_LIST", 26, 26, 2, x7eVar6);
        j7e j7eVar28 = new j7e("MESSAGE_LIST", 27, 27, 2, x7eVar7);
        j7e j7eVar29 = new j7e("BYTES_LIST", 28, 28, 2, x7eVar8);
        j7e j7eVar30 = new j7e("UINT32_LIST", 29, 29, 2, x7eVar4);
        j7e j7eVar31 = new j7e("ENUM_LIST", 30, 30, 2, x7eVar9);
        j7e j7eVar32 = new j7e("SFIXED32_LIST", 31, 31, 2, x7eVar4);
        j7e j7eVar33 = new j7e("SFIXED64_LIST", 32, 32, 2, x7eVar3);
        j7e j7eVar34 = new j7e("SINT32_LIST", 33, 33, 2, x7eVar4);
        j7e j7eVar35 = new j7e("SINT64_LIST", 34, 34, 2, x7eVar3);
        j7e j7eVar36 = new j7e("DOUBLE_LIST_PACKED", 35, 35, 3, x7eVar);
        b = j7eVar36;
        j7e j7eVar37 = new j7e("FLOAT_LIST_PACKED", 36, 36, 3, x7eVar2);
        j7e j7eVar38 = new j7e("INT64_LIST_PACKED", 37, 37, 3, x7eVar3);
        j7e j7eVar39 = new j7e("UINT64_LIST_PACKED", 38, 38, 3, x7eVar3);
        j7e j7eVar40 = new j7e("INT32_LIST_PACKED", 39, 39, 3, x7eVar4);
        j7e j7eVar41 = new j7e("FIXED64_LIST_PACKED", 40, 40, 3, x7eVar3);
        j7e j7eVar42 = new j7e("FIXED32_LIST_PACKED", 41, 41, 3, x7eVar4);
        j7e j7eVar43 = new j7e("BOOL_LIST_PACKED", 42, 42, 3, x7eVar5);
        j7e j7eVar44 = new j7e("UINT32_LIST_PACKED", 43, 43, 3, x7eVar4);
        j7e j7eVar45 = new j7e("ENUM_LIST_PACKED", 44, 44, 3, x7eVar9);
        j7e j7eVar46 = new j7e("SFIXED32_LIST_PACKED", 45, 45, 3, x7eVar4);
        j7e j7eVar47 = new j7e("SFIXED64_LIST_PACKED", 46, 46, 3, x7eVar3);
        j7e j7eVar48 = new j7e("SINT32_LIST_PACKED", 47, 47, 3, x7eVar4);
        j7e j7eVar49 = new j7e("SINT64_LIST_PACKED", 48, 48, 3, x7eVar3);
        c = j7eVar49;
        e = new j7e[]{j7eVar, j7eVar2, j7eVar3, j7eVar4, j7eVar5, j7eVar6, j7eVar7, j7eVar8, j7eVar9, j7eVar10, j7eVar11, j7eVar12, j7eVar13, j7eVar14, j7eVar15, j7eVar16, j7eVar17, j7eVar18, j7eVar19, j7eVar20, j7eVar21, j7eVar22, j7eVar23, j7eVar24, j7eVar25, j7eVar26, j7eVar27, j7eVar28, j7eVar29, j7eVar30, j7eVar31, j7eVar32, j7eVar33, j7eVar34, j7eVar35, j7eVar36, j7eVar37, j7eVar38, j7eVar39, j7eVar40, j7eVar41, j7eVar42, j7eVar43, j7eVar44, j7eVar45, j7eVar46, j7eVar47, j7eVar48, j7eVar49, new j7e("GROUP_LIST", 49, 49, 2, x7eVar7), new j7e("MAP", 50, 50, 4, x7e.a)};
        j7e[] values = values();
        d = new j7e[values.length];
        for (j7e j7eVar50 : values) {
            d[j7eVar50.a] = j7eVar50;
        }
    }

    public j7e(String str, int i, int i2, int i3, x7e x7eVar) {
        this.a = i2;
        int C = a82.C(i3);
        if (C != 1) {
            if (C == 3) {
                x7eVar.getClass();
            }
        } else {
            x7eVar.getClass();
        }
        if (i3 == 1) {
            int i4 = i7e.a[x7eVar.ordinal()];
        }
    }

    public static j7e[] values() {
        return (j7e[]) e.clone();
    }
}
