package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q98  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class q98 implements rw4 {
    public static final q98 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [q98, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.OldSyncBook", obj, 34);
        n09Var.k("book_id", true);
        n09Var.k("extension_id", true);
        n09Var.k("name", true);
        n09Var.k("author", true);
        n09Var.k("name_trans", true);
        n09Var.k("author_trans", true);
        n09Var.k("cover", true);
        n09Var.k("path", true);
        n09Var.k("reference_path", true);
        n09Var.k("book_source", true);
        n09Var.k("book_location", true);
        n09Var.k("percent", true);
        n09Var.k("last_index", true);
        n09Var.k("last_position", true);
        n09Var.k("last_chapter", true);
        n09Var.k("last_chapter_trans", true);
        n09Var.k("timestamp", true);
        n09Var.k("total_reading_time", true);
        n09Var.k("total_tts_time", true);
        n09Var.k("support_update", true);
        n09Var.k("book_folder", true);
        n09Var.k("last_update", true);
        n09Var.k("last_new_chap", true);
        n09Var.k("follow_new_chap", true);
        n09Var.k("book_type", true);
        n09Var.k("book_status", true);
        n09Var.k("chapter_count", true);
        n09Var.k("is_new", true);
        n09Var.k("nsfw", true);
        n09Var.k("hide_chap_name", true);
        n09Var.k("tags", true);
        n09Var.k("enable_trans", true);
        n09Var.k("favorite", true);
        n09Var.k("config", true);
        descriptor = n09Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x02a3, code lost:
        if (defpackage.c16.i(r0, "") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02d9, code lost:
        if (defpackage.c16.i(r0, "") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0171, code lost:
        if (java.lang.Float.compare(r0, defpackage.nae.e) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0187, code lost:
        if (defpackage.c16.i(r0, "") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019d, code lost:
        if (defpackage.c16.i(r0, "") == false) goto L62;
     */
    @Override // defpackage.s76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.jbe r43, java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q98.a(jbe, java.lang.Object):void");
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        int i;
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        boolean z8 = true;
        while (z8) {
            int f3 = t.f(o9aVar);
            switch (f3) {
                case -1:
                    z8 = false;
                    continue;
                case 0:
                    str = t.k(o9aVar, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    str2 = t.k(o9aVar, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    str3 = t.k(o9aVar, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    str4 = t.k(o9aVar, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    str5 = t.k(o9aVar, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    str6 = t.k(o9aVar, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    str7 = t.k(o9aVar, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    str8 = t.k(o9aVar, 7);
                    i2 |= Token.CASE;
                    continue;
                case 8:
                    str9 = t.k(o9aVar, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    str10 = t.k(o9aVar, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    i4 = t.r(o9aVar, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    i2 |= 2048;
                    f = t.e(o9aVar, 11);
                    continue;
                case 12:
                    i5 = t.r(o9aVar, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    i2 |= 8192;
                    f2 = t.e(o9aVar, 13);
                    continue;
                case 14:
                    str11 = t.k(o9aVar, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    str12 = t.k(o9aVar, 15);
                    i = 32768;
                    break;
                case 16:
                    long D = t.D(o9aVar, 16);
                    i2 |= Parser.ARGC_LIMIT;
                    j = D;
                    continue;
                case 17:
                    i2 |= 131072;
                    j2 = t.D(o9aVar, 17);
                    continue;
                case 18:
                    i2 |= 262144;
                    j3 = t.D(o9aVar, 18);
                    continue;
                case 19:
                    z = t.z(o9aVar, 19);
                    i = 524288;
                    break;
                case 20:
                    i2 |= 1048576;
                    j4 = t.D(o9aVar, 20);
                    continue;
                case 21:
                    i2 |= 2097152;
                    j5 = t.D(o9aVar, 21);
                    continue;
                case 22:
                    i2 |= 4194304;
                    j6 = t.D(o9aVar, 22);
                    continue;
                case 23:
                    z2 = t.z(o9aVar, 23);
                    i = 8388608;
                    break;
                case 24:
                    i6 = t.r(o9aVar, 24);
                    i = 16777216;
                    break;
                case 25:
                    i7 = t.r(o9aVar, 25);
                    i = 33554432;
                    break;
                case 26:
                    i8 = t.r(o9aVar, 26);
                    i = 67108864;
                    break;
                case 27:
                    z3 = t.z(o9aVar, 27);
                    i = 134217728;
                    break;
                case 28:
                    z4 = t.z(o9aVar, 28);
                    i = 268435456;
                    break;
                case 29:
                    z5 = t.z(o9aVar, 29);
                    i = 536870912;
                    break;
                case 30:
                    str13 = t.k(o9aVar, 30);
                    i = 1073741824;
                    break;
                case 31:
                    z6 = t.z(o9aVar, 31);
                    i = Integer.MIN_VALUE;
                    break;
                case 32:
                    z7 = t.z(o9aVar, 32);
                    i3 |= 1;
                    continue;
                case Token.GETPROP /* 33 */:
                    str14 = t.k(o9aVar, 33);
                    i3 |= 2;
                    continue;
                default:
                    fb4.a(f3);
                    return null;
            }
            i2 |= i;
        }
        t.n(o9aVar);
        return new s98(i2, i3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i4, f, i5, f2, str11, str12, j, j2, j3, z, j4, j5, j6, z2, i6, i7, i8, z3, z4, z5, str13, z6, z7, str14);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        zi4 zi4Var = zi4.a;
        ky6 ky6Var = ky6.a;
        ms0 ms0Var = ms0.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, c4bVar, c4bVar, c4bVar, c4bVar, c4bVar, c4bVar, c4bVar, xy5Var, zi4Var, xy5Var, zi4Var, c4bVar, c4bVar, ky6Var, ky6Var, ky6Var, ms0Var, ky6Var, ky6Var, ky6Var, ms0Var, xy5Var, xy5Var, xy5Var, ms0Var, ms0Var, ms0Var, c4bVar, ms0Var, ms0Var, c4bVar};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
