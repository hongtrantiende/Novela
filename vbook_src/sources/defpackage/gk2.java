package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gk2  reason: default package */
/* loaded from: classes3.dex */
public final class gk2 extends c3e {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk2(mm mmVar, Object obj, int i) {
        super(mmVar);
        this.b = i;
        this.c = obj;
    }

    public static final String Y(gk2 gk2Var, int i) {
        gk2Var.getClass();
        if (i == 0) {
            return "()";
        }
        StringBuilder sb = new StringBuilder((i * 2) + 1);
        sb.append("(?");
        int i2 = i - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(",?");
        }
        sb.append(')');
        return sb.toString();
    }

    public void A0(en2 en2Var) {
        ((mm) this.a).q(-873225298, "INSERT OR REPLACE INTO DbDownload (id, bookId, title, image, path, start, end, downloaded, total, type, status, createAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new qk2(12, en2Var, this));
        C(-873225298, new hn2(1));
    }

    public void B0(un2 un2Var) {
        un2Var.getClass();
        ((mm) this.a).q(-1454155257, "INSERT OR REPLACE INTO DbExtension (id, name, author, version, source, path, regex, icon, description, language, type, nsfw, development, draft, encrypt, scriptMetadata, settingMetadata, scriptData, settingData, translateData, pinedAt, lastUse, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new qk2(13, un2Var, this));
        C(-1454155257, new ao2(0));
    }

    public void C0(to2 to2Var) {
        ((mm) this.a).q(-801026863, "INSERT OR REPLACE INTO DbNotification (id, type, content, createAt, read)\nVALUES (?, ?, ?, ?, ?)", new qk2(14, to2Var, this));
        C(-801026863, new ao2(26));
    }

    public void D0(vo2 vo2Var) {
        ((mm) this.a).q(145791093, "INSERT OR REPLACE INTO DbPage (id, bookId, position, path, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?)", new qk2(15, vo2Var, this));
        C(145791093, new ao2(28));
    }

    public void E0(cp2 cp2Var) {
        ((mm) this.a).q(881478771, "INSERT OR REPLACE INTO DbQtWord (id, bookId, word, trans, type, mode, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", new qk2(16, cp2Var, this));
        C(881478771, new yo2(9));
    }

    public void F0(tp2 tp2Var) {
        tp2Var.getClass();
        ((mm) this.a).q(-2084674646, "INSERT OR REPLACE INTO DbTocLink (id, bookId, title, path, parentId, position, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", new qk2(20, tp2Var, this));
        C(-2084674646, new yo2(28));
    }

    public void G0(zp2 zp2Var) {
        ((mm) this.a).q(-401570240, "INSERT OR REPLACE INTO DbTrash (id, bookId, word, type, regex, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?)", new qk2(21, zp2Var, this));
        C(-401570240, new bq2(4));
    }

    public void H0(String str, String str2, String str3) {
        str3.getClass();
        ((mm) this.a).q(936991630, "UPDATE DbBook\nSET extensionId = ?, source = ?\nWHERE id = ?", new r7(19, str, str2, str3));
        C(936991630, new bk2(15));
    }

    public void I0(long j, String str) {
        str.getClass();
        ((mm) this.a).q(2073247462, "UPDATE DbBook\nSET updateAt = ?\nWHERE id = ?", new ik2(str, j, 2));
        C(2073247462, new bk2(19));
    }

    public void J0(final String str, final int i, final String str2, final double d, final long j, final String str3) {
        rs8.w(str, str2, str3);
        ((mm) this.a).q(220953231, "UPDATE DbBook\nSET lastReadChapterId = ?,\n    lastReadChapterIndex = ?,\n    lastReadChapterName = ?,\n    lastReadChapterPercent = ?,\n    lastRead = ?,\n    newUpdateCount = 0\nWHERE id = ? AND lastRead <= ?", new xt4() { // from class: lk2
            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                nm nmVar = (nm) obj;
                nmVar.getClass();
                nmVar.g(0, str);
                ((kh5) this.c).getClass();
                nmVar.j(1, Long.valueOf(i));
                nmVar.g(2, str2);
                nmVar.k(3, Double.valueOf(d));
                long j2 = j;
                nmVar.j(4, Long.valueOf(j2));
                nmVar.g(5, str3);
                nmVar.j(6, Long.valueOf(j2));
                return pvc.a;
            }
        });
        C(220953231, new bk2(16));
    }

    public void K0(Map map, String str) {
        int i = this.b;
        str.getClass();
        switch (i) {
            case 1:
                ((mm) this.a).q(1138991138, "UPDATE DbBook\nSET translate = ?\nWHERE id = ?", new jk2(this, map, str, 1));
                C(1138991138, new bk2(4));
                return;
            default:
                ((mm) this.a).q(-2080536614, "UPDATE DbExtension\nSET translateData = ?\nWHERE id = ?", new r7(22, this, map, str));
                C(-2080536614, new hn2(28));
                return;
        }
    }

    public void L0(final int i, final int i2, final long j, final long j2, final String str) {
        str.getClass();
        ((mm) this.a).q(1720876770, "UPDATE DbBook\nSET totalChapter = ?, newUpdateCount = newUpdateCount + ?, lastUpdate = ?, updateAt = ?\nWHERE id = ?", new xt4() { // from class: mk2
            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                nm nmVar = (nm) obj;
                nmVar.getClass();
                gk2 gk2Var = gk2.this;
                ((kh5) gk2Var.c).getClass();
                nmVar.j(0, Long.valueOf(i));
                ((kh5) gk2Var.c).getClass();
                nmVar.j(1, Long.valueOf(i2));
                nmVar.j(2, Long.valueOf(j));
                nmVar.j(3, Long.valueOf(j2));
                nmVar.g(4, str);
                return pvc.a;
            }
        });
        C(1720876770, new bk2(21));
    }

    public void M0(int i, int i2, String str) {
        str.getClass();
        ((mm) this.a).q(-1180271318, "UPDATE DbChapter\nSET count = ?\nWHERE bookId = ? AND position = ?", new tm2(this, i, str, i2, 1));
        C(-1180271318, new fm2(17));
    }

    public void N0(int i, int i2, String str) {
        str.getClass();
        ((mm) this.a).q(-1060609395, "UPDATE DbChapter\nSET downloaded = ?, count = ?\nWHERE bookId = ? AND position = ?", new tm2(this, i, str, i2, 0));
        C(-1060609395, new fm2(15));
    }

    public void O0(String str, long j, int i) {
        str.getClass();
        ((mm) this.a).q(-2115846629, "UPDATE DbChapter\nSET lastRead = ?\nWHERE bookId = ? AND position = ?", new um2(j, str, this, i));
        C(-2115846629, new fm2(16));
    }

    public void P0(int i, String str) {
        str.getClass();
        ((mm) this.a).q(-2061562032, "UPDATE DbDownload\nSET status = ?\nWHERE id = ?", new in2(this, i, str, 0));
        C(-2061562032, new hn2(2));
    }

    public void Z(String str) {
        str.getClass();
        ((mm) this.a).q(1411706676, "DELETE FROM DbTrash\nWHERE bookId = ?", new ui2(str, 27));
        C(1411706676, new bq2(0));
    }

    public uf9 a0(String str) {
        int i = this.b;
        str.getClass();
        switch (i) {
            case 1:
                tf9 q = ((mm) this.a).q(1805192001, "DELETE FROM DbBook\nWHERE id = ?", new ui2(str, 2));
                C(1805192001, new bk2(20));
                return q;
            case 2:
                tf9 q2 = ((mm) this.a).q(-1956331058, "DELETE FROM DbBookmark\nWHERE id = ?", new ui2(str, 3));
                C(-1956331058, new bk2(28));
                return q2;
            default:
                tf9 q3 = ((mm) this.a).q(729812837, "DELETE FROM DbQtWord\nWHERE id = ?", new ui2(str, 23));
                C(729812837, new yo2(6));
                return q3;
        }
    }

    public uf9 b0() {
        switch (this.b) {
            case 5:
                tf9 q = ((mm) this.a).q(387880673, "DELETE FROM DbDownload", null);
                C(387880673, new hn2(4));
                return q;
            case 6:
                tf9 q2 = ((mm) this.a).q(-1673292312, "DELETE FROM DbExtension", null);
                C(-1673292312, new ao2(4));
                return q2;
            default:
                tf9 q3 = ((mm) this.a).q(-527157538, "DELETE FROM DbNotification", null);
                C(-527157538, new ao2(22));
                return q3;
        }
    }

    public void c0(String str) {
        str.getClass();
        ((mm) this.a).q(1657400155, "DELETE FROM DbQtWord\nWHERE bookId = ?", new ui2(str, 22));
        C(1657400155, new yo2(7));
    }

    public void d0(String str) {
        str.getClass();
        ((mm) this.a).q(-413366321, "DELETE FROM DbBookmark\nWHERE bookId = ?", new ui2(str, 4));
        C(-413366321, new bk2(24));
    }

    public void e0(String str) {
        str.getClass();
        ((mm) this.a).q(1976631124, "DELETE FROM DbTrash\nWHERE word = ?", new ui2(str, 28));
        C(1976631124, new bq2(2));
    }

    public void f0(String str) {
        str.getClass();
        ((mm) this.a).q(318042797, "DELETE FROM DbChapter\nWHERE bookId = ?", new ui2(str, 7));
        C(318042797, new fm2(19));
    }

    public void g0(String str) {
        str.getClass();
        ((mm) this.a).q(1633076525, "DELETE FROM DbContent\nWHERE bookId = ?", new ui2(str, 8));
        C(1633076525, new fm2(23));
    }

    public void h0(int i, String str) {
        str.getClass();
        ((mm) this.a).q(-1050045564, "DELETE FROM DbQtWord\nWHERE bookId = ? AND type = ?", new in2(i, str, this, 1));
        C(-1050045564, new yo2(8));
    }

    public void i0(String str) {
        str.getClass();
        ((mm) this.a).q(-713904995, "DELETE FROM DbPage\nWHERE bookId = ?", new ui2(str, 20));
        C(-713904995, new ao2(27));
    }

    public void j0(String str) {
        str.getClass();
        ((mm) this.a).q(-1142400499, "DELETE FROM DbTocLink\nWHERE bookId = ?", new ui2(str, 26));
        C(-1142400499, new yo2(27));
    }

    public pf9 k0(String str) {
        int i = this.b;
        str.getClass();
        switch (i) {
            case 1:
                el2 el2Var = el2.a;
                return new ok2(this, str, new kk2(this, 7), (char) 0);
            case 2:
            case 3:
            default:
                eo2 eo2Var = eo2.a;
                return new co2(this, str, new zn2(this, 6));
            case 4:
                an2 an2Var = an2.a;
                return new zm2(this, str, new ym2(this, 0));
            case 5:
                kn2 kn2Var = kn2.a;
                return new jn2(this, str, new fn2(this, 3), (byte) 0);
        }
    }

    public pf9 l0() {
        ln2 ln2Var = ln2.a;
        mm mmVar = (mm) this.a;
        fn2 fn2Var = new fn2(this, 1);
        mmVar.getClass();
        return new xla(-938800288, new String[]{"DbDownload"}, mmVar, "DbDownload.sq", "getAll", "SELECT DbDownload.id, DbDownload.bookId, DbDownload.title, DbDownload.image, DbDownload.path, DbDownload.start, DbDownload.end, DbDownload.downloaded, DbDownload.total, DbDownload.type, DbDownload.status, DbDownload.createAt\nFROM DbDownload\nORDER BY createAt DESC", fn2Var);
    }

    public pf9 m0(String str) {
        str.getClass();
        gp2 gp2Var = gp2.a;
        return new ep2(this, str, new dp2(this, 2));
    }

    public zl2 n0(int i, String str) {
        str.getClass();
        hp2 hp2Var = hp2.a;
        return new zl2(this, str, i, new dp2(this, 0));
    }

    public fp2 o0(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        jp2 jp2Var = jp2.a;
        return new fp2(this, str, i, str2, new dp2(this, 3));
    }

    public vm2 p0(String str) {
        str.getClass();
        wm2 wm2Var = wm2.a;
        return new vm2(this, str, new al2(this));
    }

    public zm2 q0(String str) {
        str.getClass();
        return new zm2(this, str, new fm2(20), (char) 0);
    }

    public vk2 r0(boolean z) {
        nl2 nl2Var = nl2.a;
        return new vk2(this, z, new kk2(this, 4));
    }

    public pk2 s0(int i) {
        kp2 kp2Var = kp2.a;
        return new pk2(this, i, new dp2(this, 1), 3);
    }

    public pk2 t0(int i) {
        ol2 ol2Var = ol2.a;
        return new pk2(this, i, new kk2(this, 11), 2);
    }

    public xla u0() {
        ho2 ho2Var = ho2.a;
        mm mmVar = (mm) this.a;
        ao2 ao2Var = new ao2(2);
        mmVar.getClass();
        return new xla(508535728, new String[]{"DbExtension"}, mmVar, "DbExtension.sq", "getInstalledReadExtensionRegex", "SELECT id, regex\nFROM DbExtension\nWHERE draft = 0 AND (type = 1 OR type = 2 OR type = 3 OR type = 4)\nORDER BY pinedAt DESC, lastUse DESC, updateAt DESC", ao2Var);
    }

    public vp2 v0(String str) {
        str.getClass();
        yp2 yp2Var = yp2.a;
        return new vp2(this, str, new up2(this, 0));
    }

    public tf9 w0(xm2 xm2Var) {
        tf9 q = ((mm) this.a).q(-779491839, "INSERT OR REPLACE INTO DbContent (id, bookId, position, content, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?)", new qk2(10, xm2Var, this));
        C(-779491839, new fm2(24));
        return q;
    }

    public void x0(hk2 hk2Var) {
        ((mm) this.a).q(1956857935, "INSERT OR REPLACE INTO DbBook (id, name, author, cover, type, format, category, language, pathId, path, source, extensionId, status, location, description, isNsfw, lastReadChapterName, lastReadChapterId, lastReadChapterIndex, lastReadChapterPercent, totalChapter, totalReadTime, totalListenedTime, follow, favorite, hidden, pined, newUpdateCount, translate, extras, readScore, lastUpdate, lastRead, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new k0(27, hk2Var, this));
        C(1956857935, new bk2(7));
    }

    public void y0(xl2 xl2Var) {
        ((mm) this.a).q(-1804665124, "INSERT OR REPLACE INTO DbBookmark (id, bookId, chapterIndex, chapterName, type, content, description, color, startPosition, endPosition, createAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new qk2(7, xl2Var, this));
        C(-1804665124, new bk2(25));
    }

    public void z0(sm2 sm2Var) {
        sm2Var.getClass();
        ((mm) this.a).q(429290709, "INSERT OR REPLACE INTO DbChapter (id, bookId, pathId, position, path, count, downloaded, pay, lock, lastRead, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new qk2(9, sm2Var, this));
        C(429290709, new fm2(18));
    }
}
