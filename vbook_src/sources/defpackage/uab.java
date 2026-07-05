package defpackage;

import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uab  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class uab implements rw4 {
    public static final uab a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [uab, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncBook", obj, 35);
        n09Var.k("id", true);
        n09Var.k("name", true);
        n09Var.k("author", true);
        n09Var.k("cover", true);
        n09Var.k("type", true);
        n09Var.k("format", true);
        n09Var.k("category", true);
        n09Var.k("language", true);
        n09Var.k("path_id", true);
        n09Var.k("path", true);
        n09Var.k("source", true);
        n09Var.k("extension_id", true);
        n09Var.k("status", true);
        n09Var.k("location", true);
        n09Var.k("description", true);
        n09Var.k("is_nsfw", true);
        n09Var.k("last_read_chapter_name", true);
        n09Var.k("last_read_chapter_id", true);
        n09Var.k("last_read_chapter_index", true);
        n09Var.k("last_read_chapter_percent", true);
        n09Var.k("total_chapter", true);
        n09Var.k("total_read_time", true);
        n09Var.k("total_listened_time", true);
        n09Var.k("follow", true);
        n09Var.k("favorite", true);
        n09Var.k("hidden", true);
        n09Var.k("pined", true);
        n09Var.k("new_update_count", true);
        n09Var.k("translate", true);
        n09Var.k("extras", true);
        n09Var.k("read_score", true);
        n09Var.k("last_update", true);
        n09Var.k("last_read", true);
        n09Var.k("create_at", true);
        n09Var.k("update_at", true);
        descriptor = n09Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e9, code lost:
        if (defpackage.c16.i(r0, "") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0210, code lost:
        if (java.lang.Float.compare(r1, defpackage.nae.e) != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ac, code lost:
        if (defpackage.c16.i(r0, r15) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ca, code lost:
        if (defpackage.c16.i(r0, r15) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a5, code lost:
        if (defpackage.c16.i(r0, r15) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d3, code lost:
        if (defpackage.c16.i(r0, "") == false) goto L63;
     */
    @Override // defpackage.s76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.jbe r48, java.lang.Object r49) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uab.a(jbe, java.lang.Object):void");
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        ye6[] ye6VarArr;
        boolean z;
        int i;
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr2 = wab.J;
        float f = 0.0f;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        Map map = null;
        Map map2 = null;
        boolean z2 = true;
        List list = null;
        String str = null;
        Map map3 = null;
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        Map map4 = null;
        Map map5 = null;
        String str3 = null;
        int i4 = 0;
        int i5 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        String str8 = null;
        String str9 = null;
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i10 = 0;
        while (z2) {
            int f2 = t.f(o9aVar);
            switch (f2) {
                case -1:
                    ye6VarArr = ye6VarArr2;
                    z2 = false;
                    continue;
                    ye6VarArr2 = ye6VarArr;
                case 0:
                    ye6VarArr = ye6VarArr2;
                    str2 = t.k(o9aVar, 0);
                    i2 |= 1;
                    continue;
                    ye6VarArr2 = ye6VarArr;
                case 1:
                    ye6VarArr = ye6VarArr2;
                    map4 = (Map) t.q(o9aVar, 1, (s76) ye6VarArr[1].getValue(), map4);
                    i2 |= 2;
                    break;
                case 2:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    map5 = (Map) t.q(o9aVar, 2, (s76) ye6VarArr[2].getValue(), map5);
                    i2 |= 4;
                    break;
                case 3:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    str3 = t.k(o9aVar, 3);
                    i2 |= 8;
                    break;
                case 4:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i4 = t.r(o9aVar, 4);
                    i2 |= 16;
                    break;
                case 5:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i5 = t.r(o9aVar, 5);
                    i2 |= 32;
                    break;
                case 6:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    list = (List) t.q(o9aVar, 6, (s76) ye6VarArr[6].getValue(), list);
                    i2 |= 64;
                    break;
                case 7:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    str4 = t.k(o9aVar, 7);
                    i2 |= Token.CASE;
                    break;
                case 8:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    str5 = t.k(o9aVar, 8);
                    i2 |= 256;
                    break;
                case 9:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    str6 = t.k(o9aVar, 9);
                    i2 |= 512;
                    break;
                case 10:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    str7 = t.k(o9aVar, 10);
                    i2 |= 1024;
                    break;
                case 11:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    str = (String) t.x(o9aVar, 11, c4b.a, str);
                    i2 |= 2048;
                    break;
                case 12:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i6 = t.r(o9aVar, 12);
                    i2 |= 4096;
                    break;
                case 13:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i7 = t.r(o9aVar, 13);
                    i2 |= 8192;
                    break;
                case 14:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    map3 = (Map) t.q(o9aVar, 14, (s76) ye6VarArr[14].getValue(), map3);
                    i2 |= 16384;
                    break;
                case 15:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    z3 = t.z(o9aVar, 15);
                    i = 32768;
                    i2 |= i;
                    break;
                case 16:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    str8 = t.k(o9aVar, 16);
                    i = Parser.ARGC_LIMIT;
                    i2 |= i;
                    break;
                case 17:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    str9 = t.k(o9aVar, 17);
                    i = 131072;
                    i2 |= i;
                    break;
                case 18:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i8 = t.r(o9aVar, 18);
                    i = 262144;
                    i2 |= i;
                    break;
                case 19:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i2 |= 524288;
                    f = t.e(o9aVar, 19);
                    break;
                case 20:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i9 = t.r(o9aVar, 20);
                    i = 1048576;
                    i2 |= i;
                    break;
                case 21:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i2 |= 2097152;
                    j = t.D(o9aVar, 21);
                    break;
                case 22:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i2 |= 4194304;
                    j2 = t.D(o9aVar, 22);
                    break;
                case 23:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    z4 = t.z(o9aVar, 23);
                    i = 8388608;
                    i2 |= i;
                    break;
                case 24:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    z5 = t.z(o9aVar, 24);
                    i = 16777216;
                    i2 |= i;
                    break;
                case 25:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    z6 = t.z(o9aVar, 25);
                    i = 33554432;
                    i2 |= i;
                    break;
                case 26:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    z7 = t.z(o9aVar, 26);
                    i = 67108864;
                    i2 |= i;
                    break;
                case 27:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    i10 = t.r(o9aVar, 27);
                    i = 134217728;
                    i2 |= i;
                    break;
                case 28:
                    ye6VarArr = ye6VarArr2;
                    z = true;
                    map2 = (Map) t.q(o9aVar, 28, (s76) ye6VarArr[28].getValue(), map2);
                    i = 268435456;
                    i2 |= i;
                    break;
                case 29:
                    z = true;
                    ye6VarArr = ye6VarArr2;
                    map = (Map) t.q(o9aVar, 29, (s76) ye6VarArr2[29].getValue(), map);
                    i = 536870912;
                    i2 |= i;
                    break;
                case 30:
                    i2 |= 1073741824;
                    ye6VarArr = ye6VarArr2;
                    j3 = t.D(o9aVar, 30);
                    break;
                case 31:
                    i2 |= Integer.MIN_VALUE;
                    ye6VarArr = ye6VarArr2;
                    j4 = t.D(o9aVar, 31);
                    break;
                case 32:
                    i3 |= 1;
                    ye6VarArr = ye6VarArr2;
                    j5 = t.D(o9aVar, 32);
                    break;
                case Token.GETPROP /* 33 */:
                    i3 |= 2;
                    ye6VarArr = ye6VarArr2;
                    j6 = t.D(o9aVar, 33);
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    i3 |= 4;
                    ye6VarArr = ye6VarArr2;
                    j7 = t.D(o9aVar, 34);
                    break;
                default:
                    fb4.a(f2);
                    return null;
            }
            ye6VarArr2 = ye6VarArr;
        }
        t.n(o9aVar);
        return new wab(i2, i3, str2, map4, map5, str3, i4, i5, list, str4, str5, str6, str7, str, i6, i7, map3, z3, str8, str9, i8, f, i9, j, j2, z4, z5, z6, z7, i10, map2, map, j3, j4, j5, j6, j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw4
    public final s76[] d() {
        ye6[] ye6VarArr = wab.J;
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        ms0 ms0Var = ms0.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{c4bVar, ye6VarArr[1].getValue(), ye6VarArr[2].getValue(), c4bVar, xy5Var, xy5Var, ye6VarArr[6].getValue(), c4bVar, c4bVar, c4bVar, c4bVar, wq9.H(c4bVar), xy5Var, xy5Var, ye6VarArr[14].getValue(), ms0Var, c4bVar, c4bVar, xy5Var, zi4.a, xy5Var, ky6Var, ky6Var, ms0Var, ms0Var, ms0Var, ms0Var, xy5Var, ye6VarArr[28].getValue(), ye6VarArr[29].getValue(), ky6Var, ky6Var, ky6Var, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
