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
/* renamed from: k0e  reason: default package */
/* loaded from: classes.dex */
public final class k0e {
    public static final k0e b;
    public static final k0e c;
    public static final k0e[] d;
    public static final /* synthetic */ k0e[] e;
    public final int a;
    /* JADX INFO: Fake field, exist only in values array */
    k0e EF0;

    static {
        j1e j1eVar = j1e.e;
        k0e k0eVar = new k0e("DOUBLE", 0, 0, 1, j1eVar);
        j1e j1eVar2 = j1e.d;
        k0e k0eVar2 = new k0e("FLOAT", 1, 1, 1, j1eVar2);
        j1e j1eVar3 = j1e.c;
        k0e k0eVar3 = new k0e("INT64", 2, 2, 1, j1eVar3);
        k0e k0eVar4 = new k0e("UINT64", 3, 3, 1, j1eVar3);
        j1e j1eVar4 = j1e.b;
        k0e k0eVar5 = new k0e("INT32", 4, 4, 1, j1eVar4);
        k0e k0eVar6 = new k0e("FIXED64", 5, 5, 1, j1eVar3);
        k0e k0eVar7 = new k0e("FIXED32", 6, 6, 1, j1eVar4);
        j1e j1eVar5 = j1e.f;
        k0e k0eVar8 = new k0e("BOOL", 7, 7, 1, j1eVar5);
        j1e j1eVar6 = j1e.C;
        k0e k0eVar9 = new k0e("STRING", 8, 8, 1, j1eVar6);
        j1e j1eVar7 = j1e.F;
        k0e k0eVar10 = new k0e("MESSAGE", 9, 9, 1, j1eVar7);
        j1e j1eVar8 = j1e.D;
        k0e k0eVar11 = new k0e("BYTES", 10, 10, 1, j1eVar8);
        k0e k0eVar12 = new k0e("UINT32", 11, 11, 1, j1eVar4);
        j1e j1eVar9 = j1e.E;
        k0e k0eVar13 = new k0e("ENUM", 12, 12, 1, j1eVar9);
        k0e k0eVar14 = new k0e("SFIXED32", 13, 13, 1, j1eVar4);
        k0e k0eVar15 = new k0e("SFIXED64", 14, 14, 1, j1eVar3);
        k0e k0eVar16 = new k0e("SINT32", 15, 15, 1, j1eVar4);
        k0e k0eVar17 = new k0e("SINT64", 16, 16, 1, j1eVar3);
        k0e k0eVar18 = new k0e("GROUP", 17, 17, 1, j1eVar7);
        k0e k0eVar19 = new k0e("DOUBLE_LIST", 18, 18, 2, j1eVar);
        k0e k0eVar20 = new k0e("FLOAT_LIST", 19, 19, 2, j1eVar2);
        k0e k0eVar21 = new k0e("INT64_LIST", 20, 20, 2, j1eVar3);
        k0e k0eVar22 = new k0e("UINT64_LIST", 21, 21, 2, j1eVar3);
        k0e k0eVar23 = new k0e("INT32_LIST", 22, 22, 2, j1eVar4);
        k0e k0eVar24 = new k0e("FIXED64_LIST", 23, 23, 2, j1eVar3);
        k0e k0eVar25 = new k0e("FIXED32_LIST", 24, 24, 2, j1eVar4);
        k0e k0eVar26 = new k0e("BOOL_LIST", 25, 25, 2, j1eVar5);
        k0e k0eVar27 = new k0e("STRING_LIST", 26, 26, 2, j1eVar6);
        k0e k0eVar28 = new k0e("MESSAGE_LIST", 27, 27, 2, j1eVar7);
        k0e k0eVar29 = new k0e("BYTES_LIST", 28, 28, 2, j1eVar8);
        k0e k0eVar30 = new k0e("UINT32_LIST", 29, 29, 2, j1eVar4);
        k0e k0eVar31 = new k0e("ENUM_LIST", 30, 30, 2, j1eVar9);
        k0e k0eVar32 = new k0e("SFIXED32_LIST", 31, 31, 2, j1eVar4);
        k0e k0eVar33 = new k0e("SFIXED64_LIST", 32, 32, 2, j1eVar3);
        k0e k0eVar34 = new k0e("SINT32_LIST", 33, 33, 2, j1eVar4);
        k0e k0eVar35 = new k0e("SINT64_LIST", 34, 34, 2, j1eVar3);
        k0e k0eVar36 = new k0e("DOUBLE_LIST_PACKED", 35, 35, 3, j1eVar);
        b = k0eVar36;
        k0e k0eVar37 = new k0e("FLOAT_LIST_PACKED", 36, 36, 3, j1eVar2);
        k0e k0eVar38 = new k0e("INT64_LIST_PACKED", 37, 37, 3, j1eVar3);
        k0e k0eVar39 = new k0e("UINT64_LIST_PACKED", 38, 38, 3, j1eVar3);
        k0e k0eVar40 = new k0e("INT32_LIST_PACKED", 39, 39, 3, j1eVar4);
        k0e k0eVar41 = new k0e("FIXED64_LIST_PACKED", 40, 40, 3, j1eVar3);
        k0e k0eVar42 = new k0e("FIXED32_LIST_PACKED", 41, 41, 3, j1eVar4);
        k0e k0eVar43 = new k0e("BOOL_LIST_PACKED", 42, 42, 3, j1eVar5);
        k0e k0eVar44 = new k0e("UINT32_LIST_PACKED", 43, 43, 3, j1eVar4);
        k0e k0eVar45 = new k0e("ENUM_LIST_PACKED", 44, 44, 3, j1eVar9);
        k0e k0eVar46 = new k0e("SFIXED32_LIST_PACKED", 45, 45, 3, j1eVar4);
        k0e k0eVar47 = new k0e("SFIXED64_LIST_PACKED", 46, 46, 3, j1eVar3);
        k0e k0eVar48 = new k0e("SINT32_LIST_PACKED", 47, 47, 3, j1eVar4);
        k0e k0eVar49 = new k0e("SINT64_LIST_PACKED", 48, 48, 3, j1eVar3);
        c = k0eVar49;
        e = new k0e[]{k0eVar, k0eVar2, k0eVar3, k0eVar4, k0eVar5, k0eVar6, k0eVar7, k0eVar8, k0eVar9, k0eVar10, k0eVar11, k0eVar12, k0eVar13, k0eVar14, k0eVar15, k0eVar16, k0eVar17, k0eVar18, k0eVar19, k0eVar20, k0eVar21, k0eVar22, k0eVar23, k0eVar24, k0eVar25, k0eVar26, k0eVar27, k0eVar28, k0eVar29, k0eVar30, k0eVar31, k0eVar32, k0eVar33, k0eVar34, k0eVar35, k0eVar36, k0eVar37, k0eVar38, k0eVar39, k0eVar40, k0eVar41, k0eVar42, k0eVar43, k0eVar44, k0eVar45, k0eVar46, k0eVar47, k0eVar48, k0eVar49, new k0e("GROUP_LIST", 49, 49, 2, j1eVar7), new k0e("MAP", 50, 50, 4, j1e.a)};
        k0e[] values = values();
        d = new k0e[values.length];
        for (k0e k0eVar50 : values) {
            d[k0eVar50.a] = k0eVar50;
        }
    }

    public k0e(String str, int i, int i2, int i3, j1e j1eVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                j1eVar.getClass();
            }
        } else {
            j1eVar.getClass();
        }
        if (i3 == 1) {
            j1e j1eVar2 = j1e.a;
            j1eVar.ordinal();
        }
    }

    public static k0e[] values() {
        return (k0e[]) e.clone();
    }
}
