package defpackage;

import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kcb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kcb implements rw4 {
    public static final kcb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kcb, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncExtension", obj, 24);
        n09Var.k("id", true);
        n09Var.k("name", true);
        n09Var.k("author", true);
        n09Var.k("version", true);
        n09Var.k("source", true);
        n09Var.k("path", true);
        n09Var.k("regex", true);
        n09Var.k("icon", true);
        n09Var.k("description", true);
        n09Var.k("language", true);
        n09Var.k("type", true);
        n09Var.k("nsfw", true);
        n09Var.k("development", true);
        n09Var.k("draft", true);
        n09Var.k("encrypt", true);
        n09Var.k("script_metadata", true);
        n09Var.k("setting_metadata", true);
        n09Var.k("script_data", true);
        n09Var.k("setting_data", true);
        n09Var.k("translate_data", true);
        n09Var.k("pined_at", true);
        n09Var.k("last_use", true);
        n09Var.k("create_at", true);
        n09Var.k("update_at", true);
        descriptor = n09Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a0, code lost:
        if (defpackage.c16.i(r0, r1) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01be, code lost:
        if (defpackage.c16.i(r0, r1) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01dc, code lost:
        if (defpackage.c16.i(r0, r1) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0164, code lost:
        if (defpackage.c16.i(r0, r1) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0182, code lost:
        if (defpackage.c16.i(r0, r1) == false) goto L62;
     */
    @Override // defpackage.s76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.jbe r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcb.a(jbe, java.lang.Object):void");
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        ye6[] ye6VarArr;
        int i;
        ye6[] ye6VarArr2;
        boolean z;
        int i2;
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr3 = mcb.y;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        boolean z2 = true;
        Map map4 = null;
        Map map5 = null;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (z2) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    ye6VarArr2 = ye6VarArr3;
                    z = z2;
                    str = t.k(o9aVar, 0);
                    i3 |= 1;
                    ye6VarArr3 = ye6VarArr2;
                    z2 = z;
                    break;
                case 1:
                    ye6VarArr = ye6VarArr3;
                    str2 = t.k(o9aVar, 1);
                    i3 |= 2;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 2:
                    ye6VarArr = ye6VarArr3;
                    str3 = t.k(o9aVar, 2);
                    i3 |= 4;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 3:
                    ye6VarArr = ye6VarArr3;
                    i4 = t.r(o9aVar, 3);
                    i3 |= 8;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 4:
                    ye6VarArr = ye6VarArr3;
                    str4 = t.k(o9aVar, 4);
                    i3 |= 16;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 5:
                    ye6VarArr = ye6VarArr3;
                    str5 = t.k(o9aVar, 5);
                    i3 |= 32;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 6:
                    ye6VarArr = ye6VarArr3;
                    str6 = t.k(o9aVar, 6);
                    i3 |= 64;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 7:
                    ye6VarArr = ye6VarArr3;
                    str7 = t.k(o9aVar, 7);
                    i3 |= Token.CASE;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 8:
                    ye6VarArr = ye6VarArr3;
                    str8 = t.k(o9aVar, 8);
                    i3 |= 256;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 9:
                    ye6VarArr = ye6VarArr3;
                    str9 = t.k(o9aVar, 9);
                    i3 |= 512;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 10:
                    ye6VarArr = ye6VarArr3;
                    i5 = t.r(o9aVar, 10);
                    i3 |= 1024;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 11:
                    ye6VarArr = ye6VarArr3;
                    z3 = t.z(o9aVar, 11);
                    i3 |= 2048;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 12:
                    ye6VarArr = ye6VarArr3;
                    z4 = t.z(o9aVar, 12);
                    i3 |= 4096;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 13:
                    ye6VarArr = ye6VarArr3;
                    z5 = t.z(o9aVar, 13);
                    i3 |= 8192;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 14:
                    ye6VarArr = ye6VarArr3;
                    z6 = t.z(o9aVar, 14);
                    i3 |= 16384;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 15:
                    ye6VarArr2 = ye6VarArr3;
                    z = z2;
                    map4 = (Map) t.q(o9aVar, 15, (s76) ye6VarArr2[15].getValue(), map4);
                    i2 = 32768;
                    i3 |= i2;
                    ye6VarArr3 = ye6VarArr2;
                    z2 = z;
                    break;
                case 16:
                    ye6VarArr2 = ye6VarArr3;
                    z = z2;
                    map5 = (Map) t.q(o9aVar, 16, (s76) ye6VarArr2[16].getValue(), map5);
                    i2 = Parser.ARGC_LIMIT;
                    i3 |= i2;
                    ye6VarArr3 = ye6VarArr2;
                    z2 = z;
                    break;
                case 17:
                    ye6VarArr2 = ye6VarArr3;
                    z = z2;
                    map3 = (Map) t.q(o9aVar, 17, (s76) ye6VarArr2[17].getValue(), map3);
                    i2 = 131072;
                    i3 |= i2;
                    ye6VarArr3 = ye6VarArr2;
                    z2 = z;
                    break;
                case 18:
                    ye6VarArr2 = ye6VarArr3;
                    z = z2;
                    map2 = (Map) t.q(o9aVar, 18, (s76) ye6VarArr2[18].getValue(), map2);
                    i2 = 262144;
                    i3 |= i2;
                    ye6VarArr3 = ye6VarArr2;
                    z2 = z;
                    break;
                case 19:
                    ye6VarArr2 = ye6VarArr3;
                    z = z2;
                    map = (Map) t.q(o9aVar, 19, (s76) ye6VarArr2[19].getValue(), map);
                    i2 = 524288;
                    i3 |= i2;
                    ye6VarArr3 = ye6VarArr2;
                    z2 = z;
                    break;
                case 20:
                    ye6VarArr = ye6VarArr3;
                    j = t.D(o9aVar, 20);
                    i = 1048576;
                    i3 |= i;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 21:
                    ye6VarArr = ye6VarArr3;
                    j2 = t.D(o9aVar, 21);
                    i = 2097152;
                    i3 |= i;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 22:
                    ye6VarArr = ye6VarArr3;
                    j3 = t.D(o9aVar, 22);
                    i = 4194304;
                    i3 |= i;
                    ye6VarArr3 = ye6VarArr;
                    break;
                case 23:
                    ye6VarArr = ye6VarArr3;
                    j4 = t.D(o9aVar, 23);
                    i = 8388608;
                    i3 |= i;
                    ye6VarArr3 = ye6VarArr;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new mcb(i3, str, str2, str3, i4, str4, str5, str6, str7, str8, str9, i5, z3, z4, z5, z6, map4, map5, map3, map2, map, j, j2, j3, j4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw4
    public final s76[] d() {
        ye6[] ye6VarArr = mcb.y;
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        ms0 ms0Var = ms0.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, xy5Var, c4bVar, c4bVar, c4bVar, c4bVar, c4bVar, c4bVar, xy5Var, ms0Var, ms0Var, ms0Var, ms0Var, ye6VarArr[15].getValue(), ye6VarArr[16].getValue(), ye6VarArr[17].getValue(), ye6VarArr[18].getValue(), ye6VarArr[19].getValue(), ky6Var, ky6Var, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
