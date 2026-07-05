package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bn6  reason: default package */
/* loaded from: classes3.dex */
public final class bn6 implements wl6 {
    public static final List c = tl1.B(21, 11, 13, 14, 12, 16, 17, 18, 22);
    public final ii2 a;
    public final io5 b;

    public bn6(ii2 ii2Var, io5 io5Var) {
        this.a = ii2Var;
        this.b = io5Var;
    }

    public final void a(String str) {
        lm2 lm2Var = this.a.f;
        lm2Var.getClass();
        str.getClass();
        rm2 rm2Var = rm2.a;
        if (((mm2) new om2(lm2Var, str, new fm2(13)).e()) == null) {
            lm2Var.j0(new mm2(by5.a.k().b(), ube.B(), str));
            return;
        }
        throw new RuntimeException();
    }

    public final Object b() {
        mm mmVar = (mm) this.a.c.a;
        bk2 bk2Var = new bk2(11);
        mmVar.getClass();
        return new xla(882080133, new String[]{"DbBook"}, mmVar, "DbBook.sq", "countBooksByChapter", "SELECT COUNT(*) FROM DbBook WHERE hidden = 0 AND totalChapter > 0", bk2Var).d();
    }

    public final Object c() {
        mm mmVar = (mm) this.a.c.a;
        bk2 bk2Var = new bk2(12);
        mmVar.getClass();
        return new xla(-1766121323, new String[]{"DbBook"}, mmVar, "DbBook.sq", "countBooksByTime", "SELECT COUNT(*) FROM DbBook WHERE hidden = 0 AND (totalReadTime > 0 OR totalListenedTime > 0)", bk2Var).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xl6
            if (r0 == 0) goto L13
            r0 = r6
            xl6 r0 = (defpackage.xl6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xl6 r0 = new xl6
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.util.Iterator r1 = r0.a
            java.util.Iterator r1 = (java.util.Iterator) r1
            defpackage.hre.r(r6)
            goto L4f
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L30:
            defpackage.hre.r(r6)
            ii2 r6 = r5.a
            gk2 r1 = r6.c
            r3 = 0
            pk2 r1 = r1.t0(r3)
            java.util.List r1 = r1.c()
            j34 r3 = new j34
            r4 = 19
            r3.<init>(r4, r1, r5)
            defpackage.l0e.z(r6, r3)
            java.util.Iterator r6 = r1.iterator()
            r1 = r6
        L4f:
            boolean r6 = r1.hasNext()
            pvc r3 = defpackage.pvc.a
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r1.next()
            hk2 r6 = (defpackage.hk2) r6
            java.lang.String r6 = r6.a
            r4 = r1
            java.util.Iterator r4 = (java.util.Iterator) r4
            r0.a = r4
            r0.d = r2
            r5.e(r6)
            n82 r6 = defpackage.n82.a
            if (r3 != r6) goto L4f
            return r6
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.d(n42):java.lang.Object");
    }

    public final void e(String str) {
        l0e.z(this.a, new j34(21, this, str));
        m66 m66Var = pe4.a;
        m66Var.g0(hn8.f(ie2.r(m66Var), str));
    }

    public final void f(String str) {
        ii2 ii2Var = this.a;
        gk2 gk2Var = ii2Var.c;
        gk2Var.getClass();
        str.getClass();
        gl2 gl2Var = gl2.a;
        l0e.z(gk2Var, new nq3(8, new ok2(gk2Var, str, new kk2(gk2Var, 19)).c(), this, str));
        lm2 lm2Var = ii2Var.f;
        lm2Var.getClass();
        ((mm) lm2Var.a).q(400211862, "DELETE FROM DbCategory\nWHERE id = ?", new ui2(str, 6));
        lm2Var.C(400211862, new fm2(9));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r9, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.yl6
            if (r0 == 0) goto L13
            r0 = r11
            yl6 r0 = (defpackage.yl6) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            yl6 r0 = new yl6
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            long r9 = r0.a
            java.util.Iterator r1 = r0.b
            java.util.Iterator r1 = (java.util.Iterator) r1
            defpackage.hre.r(r11)
            goto L6d
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L32:
            defpackage.hre.r(r11)
            ii2 r11 = r8.a
            gk2 r11 = r11.c
            r1 = 0
            pk2 r11 = r11.t0(r1)
            java.util.List r11 = r11.c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L4b:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r11.next()
            r4 = r3
            hk2 r4 = (defpackage.hk2) r4
            long r4 = r4.G
            r6 = 1
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 > 0) goto L4b
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L4b
            r1.add(r3)
            goto L4b
        L68:
            java.util.Iterator r11 = r1.iterator()
            r1 = r11
        L6d:
            boolean r11 = r1.hasNext()
            pvc r3 = defpackage.pvc.a
            if (r11 == 0) goto L8e
            java.lang.Object r11 = r1.next()
            hk2 r11 = (defpackage.hk2) r11
            java.lang.String r11 = r11.a
            r4 = r1
            java.util.Iterator r4 = (java.util.Iterator) r4
            r0.b = r4
            r0.a = r9
            r0.e = r2
            r8.e(r11)
            n82 r11 = defpackage.n82.a
            if (r3 != r11) goto L6d
            return r11
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.g(long, n42):java.lang.Object");
    }

    public final ArrayList h(int i, String str) {
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        str.getClass();
        dl2 dl2Var = dl2.a;
        List<hk2> c2 = new sk2(gk2Var, str, i, new kk2(gk2Var, 17)).c();
        ArrayList arrayList = new ArrayList(tl1.s(c2, 10));
        for (hk2 hk2Var : c2) {
            arrayList.add(ote.z(hk2Var));
        }
        return arrayList;
    }

    public final hs0 i() {
        s02 O = v9e.O(this.a.f.h0());
        sw2 sw2Var = ab3.a;
        return new hs0(v9e.z(O, ru2.c), 10);
    }

    public final hg3 j(String str) {
        str.getClass();
        s02 O = v9e.O(this.a.c.k0(str));
        sw2 sw2Var = ab3.a;
        return new hg3(v9e.B(O, ru2.c), 2);
    }

    public final hg3 k(String str) {
        str.getClass();
        String m = ox9.m(str, true);
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        m.getClass();
        ml2 ml2Var = ml2.a;
        s02 O = v9e.O(new ok2(gk2Var, m, new kk2(gk2Var, 14), (byte) 0));
        sw2 sw2Var = ab3.a;
        return new hg3(v9e.B(O, ru2.c), 3);
    }

    public final sl4 l() {
        gk2 gk2Var = this.a.c;
        List B = tl1.B(21, 11, 13, 14, 12, 16, 17, 18, 22);
        gk2Var.getClass();
        s02 O = v9e.O(new dk2(gk2Var, B, new bk2(14)));
        sw2 sw2Var = ab3.a;
        return v9e.A(O, ru2.c);
    }

    public final hg3 m() {
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        tl2 tl2Var = tl2.a;
        mm mmVar = (mm) gk2Var.a;
        kk2 kk2Var = new kk2(gk2Var, 5);
        mmVar.getClass();
        s02 O = v9e.O(new xla(-151504702, new String[]{"DbBook"}, mmVar, "DbBook.sq", "getLastReadTextBook", "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE type = 1\nORDER BY lastRead DESC\nLIMIT 1", kk2Var));
        sw2 sw2Var = ab3.a;
        return new hg3(v9e.B(O, ru2.c), 4);
    }

    public final ArrayList n(int i, int i2) {
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        vl2 vl2Var = vl2.a;
        List<hk2> c2 = new bl2(gk2Var, i, 20L, i2, new kk2(gk2Var, 15)).c();
        ArrayList arrayList = new ArrayList(tl1.s(c2, 10));
        for (hk2 hk2Var : c2) {
            arrayList.add(ote.z(hk2Var));
        }
        return arrayList;
    }

    public final ArrayList o(int i, int i2, int i3) {
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        wl2 wl2Var = wl2.a;
        List<hk2> c2 = new cl2(gk2Var, i2, i, 20L, i3, new kk2(gk2Var, 2)).c();
        ArrayList arrayList = new ArrayList(tl1.s(c2, 10));
        for (hk2 hk2Var : c2) {
            arrayList.add(ote.z(hk2Var));
        }
        return arrayList;
    }

    public final sl4 p(int i) {
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        s02 O = v9e.O(new rk2(gk2Var, i, new bk2(18)));
        sw2 sw2Var = ab3.a;
        return v9e.A(O, ru2.c);
    }

    public final ArrayList q(int i, int i2, int i3, int i4, int i5) {
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        ql2 ql2Var = ql2.a;
        List<hk2> c2 = new xk2(gk2Var, i, i3, i2, i4, i5, new kk2(gk2Var, 16)).c();
        ArrayList arrayList = new ArrayList(tl1.s(c2, 10));
        for (hk2 hk2Var : c2) {
            arrayList.add(ote.z(hk2Var));
        }
        return arrayList;
    }

    public final ArrayList r(int i, String str) {
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        str.getClass();
        sl2 sl2Var = sl2.a;
        List<hk2> c2 = new yk2(gk2Var, str, 30L, i, new kk2(gk2Var, 10)).c();
        ArrayList arrayList = new ArrayList(tl1.s(c2, 10));
        for (hk2 hk2Var : c2) {
            arrayList.add(ote.z(hk2Var));
        }
        return arrayList;
    }

    public final void s(vl6 vl6Var) {
        long b = by5.a.k().b();
        gk2 gk2Var = this.a.c;
        Map map = vl6Var.b;
        Map map2 = vl6Var.c;
        String str = vl6Var.d;
        int i = vl6Var.e;
        int i2 = vl6Var.f;
        int i3 = vl6Var.n;
        String str2 = vl6Var.l;
        String str3 = vl6Var.j;
        boolean z = vl6Var.p;
        gk2Var.x0(hk2.a((hk2) gk2Var.k0(vl6Var.a).d(), map, map2, str, i, i2, vl6Var.g, null, str3, str2, null, i3, vl6Var.o, null, z, vl6Var.u, vl6Var.x, vl6Var.y, vl6Var.z, null, 0L, b, -59815551, 3));
    }

    public final void t(String str, List list) {
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        str.getClass();
        ((mm) gk2Var.a).q(-500898902, "UPDATE DbBook\nSET category = ?\nWHERE id = ?", new r7(20, gk2Var, list, str));
        gk2Var.C(-500898902, new bk2(22));
    }

    public final void u(String str, String str2) {
        lm2 lm2Var = this.a.f;
        lm2Var.getClass();
        str2.getClass();
        str.getClass();
        ((mm) lm2Var.a).q(-1409751201, "UPDATE DbCategory\nSET name = ?\nWHERE id = ?", new nm2(str2, str, 0));
        lm2Var.C(-1409751201, new fm2(8));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(1:(4:9|10|11|12)(2:56|57))(2:58|(17:60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|(1:77)(1:78))(5:93|31|(1:33)|34|35))|13|14|(2:38|39)|16|(12:(1:19)|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)|31|(0)|34|35)(1:37)))|94|6|(0)(0)|13|14|(0)|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r4 = r9;
        r9 = r3;
        r3 = r11;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
        defpackage.pye.e(r4, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, defpackage.f76 r44, defpackage.n42 r45) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.v(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, f76, n42):java.lang.Object");
    }

    public final void w(String str, boolean z) {
        gk2 gk2Var = this.a.c;
        gk2Var.getClass();
        str.getClass();
        ((mm) gk2Var.a).q(1760632157, "UPDATE DbBook\nSET follow = ?\nWHERE id = ?", new nf0(z, str, 3));
        gk2Var.C(1760632157, new bk2(5));
    }

    public final void x(long j, long j2, String str) {
        ii2 ii2Var = this.a;
        gk2 gk2Var = ii2Var.c;
        gk2Var.getClass();
        str.getClass();
        ((mm) gk2Var.a).q(-87582354, "UPDATE DbBook\nSET totalReadTime = totalReadTime + ?\nWHERE id = ?", new ik2(str, j2, 0));
        gk2Var.C(-87582354, new bk2(2));
        ii2Var.R.o0(new lp2(ube.B(), j2, 0L, j));
    }
}
