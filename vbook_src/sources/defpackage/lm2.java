package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lm2  reason: default package */
/* loaded from: classes3.dex */
public final class lm2 extends c3e {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm2(mm mmVar, int i) {
        super(mmVar);
        this.b = i;
    }

    public void Y(pn2 pn2Var) {
        ((mm) this.a).q(-1413157652, "INSERT OR REPLACE INTO DbEmojiCategory (id, thumb, count, position)\nVALUES (?, ?, ?, ?)", new al2(pn2Var, 23));
        C(-1413157652, new hn2(11));
    }

    public void Z(on2 on2Var) {
        ((mm) this.a).q(-2138326534, "INSERT OR REPLACE INTO DbEmoji (id, category, url, lastUse)\nVALUES (?, ?, ?, ?)", new al2(on2Var, 24));
        C(-2138326534, new hn2(19));
    }

    public void a0() {
        ((mm) this.a).q(-711107012, "DELETE FROM DbDomain", null);
        C(-711107012, new fm2(27));
    }

    public void b0(String str) {
        str.getClass();
        ((mm) this.a).q(-237541725, "DELETE FROM DbName\nWHERE bookId = ?", new ui2(str, 16));
        C(-237541725, new ao2(15));
    }

    public uf9 c0() {
        switch (this.b) {
            case 1:
                tf9 q = ((mm) this.a).q(-117566933, "DELETE FROM DbCategory", null);
                C(-117566933, new fm2(10));
                return q;
            case 6:
                tf9 q2 = ((mm) this.a).q(-112717427, "DELETE FROM DbExtensionSource", null);
                C(-112717427, new ao2(11));
                return q2;
            default:
                tf9 q3 = ((mm) this.a).q(727217930, "DELETE FROM DbTTSWord", null);
                C(727217930, new yo2(23));
                return q3;
        }
    }

    public void d0(String str) {
        str.getClass();
        ((mm) this.a).q(266328203, "DELETE FROM DbExtensionLocalStorage\nWHERE extensionId = ?", new ui2(str, 13));
        C(266328203, new hn2(27));
    }

    public void e0() {
        ((mm) this.a).q(514993798, "DELETE FROM DbQtNameSkip", null);
        C(514993798, new yo2(2));
    }

    public void f0(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((mm) this.a).q(-250440798, "DELETE FROM DbExtensionLocalStorage\nWHERE extensionId = ? AND key = ?", new nm2(str, str2, 1));
        C(-250440798, new hn2(26));
    }

    public void g0(String str) {
        str.getClass();
        ((mm) this.a).q(-1905429051, "DELETE FROM DbName\nWHERE word = ?", new ui2(str, 17));
        C(-1905429051, new ao2(18));
    }

    public pf9 h0() {
        switch (this.b) {
            case 1:
                qm2 qm2Var = qm2.a;
                mm mmVar = (mm) this.a;
                fm2 fm2Var = new fm2(7);
                mmVar.getClass();
                return new xla(486302806, new String[]{"DbCategory"}, mmVar, "DbCategory.sq", "getAll", "SELECT DbCategory.id, DbCategory.name, DbCategory.createAt\nFROM DbCategory\nORDER BY createAt", fm2Var);
            case 2:
                dn2 dn2Var = dn2.a;
                mm mmVar2 = (mm) this.a;
                fm2 fm2Var2 = new fm2(28);
                mmVar2.getClass();
                return new xla(-461012900, new String[]{"DbDomain"}, mmVar2, "DbDomain.sq", "getAll", "SELECT DbDomain.id, DbDomain.domain, DbDomain.replace, DbDomain.enabled, DbDomain.position, DbDomain.createAt, DbDomain.updateAt\nFROM DbDomain\nORDER BY position ASC", fm2Var2);
            case 6:
                no2 no2Var = no2.a;
                mm mmVar3 = (mm) this.a;
                ao2 ao2Var = new ao2(12);
                mmVar3.getClass();
                return new xla(-1808306124, new String[]{"DbExtensionSource"}, mmVar3, "DbExtensionSource.sq", "getAll", "SELECT DbExtensionSource.id, DbExtensionSource.path, DbExtensionSource.author, DbExtensionSource.description, DbExtensionSource.createAt\nFROM DbExtensionSource\nORDER BY createAt DESC", ao2Var);
            default:
                bp2 bp2Var = bp2.a;
                mm mmVar4 = (mm) this.a;
                yo2 yo2Var = new yo2(5);
                mmVar4.getClass();
                return new xla(-491902267, new String[]{"DbQtNameSkip"}, mmVar4, "DbQtNameSkip.sq", "getAll", "SELECT DbQtNameSkip.id, DbQtNameSkip.word, DbQtNameSkip.createAt, DbQtNameSkip.updateAt FROM DbQtNameSkip", yo2Var);
        }
    }

    public pf9 i0(String str) {
        str.getClass();
        qo2 qo2Var = qo2.a;
        return new po2(this, str, new ao2(14), (byte) 0);
    }

    public void j0(mm2 mm2Var) {
        ((mm) this.a).q(551877796, "INSERT OR REPLACE INTO DbCategory (id, name, createAt)\nVALUES (?, ?, ?)", new al2(mm2Var, 9));
        C(551877796, new fm2(12));
    }

    public void k0(cn2 cn2Var) {
        ((mm) this.a).q(-395437910, "INSERT OR REPLACE INTO DbDomain (id, domain, replace, enabled, position, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?, ?)", new al2(cn2Var, 19));
        C(-395437910, new fm2(26));
    }

    public void l0(mo2 mo2Var) {
        ((mm) this.a).q(-1742731134, "INSERT OR REPLACE INTO DbExtensionSource (id, path, author, description, createAt)\nVALUES (?, ?, ?, ?, ?)", new bo2(mo2Var, 5));
        C(-1742731134, new ao2(8));
    }

    public void m0(oo2 oo2Var) {
        ((mm) this.a).q(1931404657, "INSERT OR REPLACE INTO DbName (id, bookId, word, replace, ignoreCase, createAt)\nVALUES (?, ?, ?, ?, ?, ?)", new bo2(oo2Var, 6));
        C(1931404657, new ao2(19));
    }

    public void n0(xo2 xo2Var) {
        ((mm) this.a).q(1326886271, "INSERT OR REPLACE INTO DbQtDictionary (id, name, nameDictionary, vpDictionary, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?)", new bo2(xo2Var, 15));
        C(1326886271, new yo2(1));
    }

    public void o0(lp2 lp2Var) {
        ((mm) this.a).q(708058342, "INSERT OR REPLACE INTO DbReadHistory (id, readTime, listenTime, createAt)\nVALUES (?, ?, ?, ?)", new bo2(lp2Var, 21));
        C(708058342, new yo2(13));
    }

    public void p0(np2 np2Var) {
        ((mm) this.a).q(841997454, "INSERT OR REPLACE INTO DbSearch (key, createAt)\nVALUES (?, ?)", new bo2(np2Var, 22));
        C(841997454, new yo2(17));
    }

    public void q0(qp2 qp2Var) {
        ((mm) this.a).q(1942281253, "INSERT OR REPLACE INTO DbTTSWord (id, word, replace, ignoreCase, createAt, updateAt)\nVALUES (?, ?, ?, ?, ?, ?)", new bo2(qp2Var, 24));
        C(1942281253, new yo2(25));
    }

    public void r0(em2 em2Var) {
        ((mm) this.a).q(-105619198, "INSERT OR REPLACE INTO DbBrowserHistory (url, title, createAt)\nVALUES (?, ?, ?)", new al2(em2Var, 6));
        C(-105619198, new fm2(4));
    }

    public void s0(vn2 vn2Var) {
        ((mm) this.a).q(-2146593561, "INSERT OR REPLACE INTO DbExtensionLocalStorage (id, extensionId, key, content)\nVALUES (?, ?, ?, ?)", new al2(vn2Var, 27));
        C(-2146593561, new hn2(21));
    }

    public void t0(ap2 ap2Var) {
        ((mm) this.a).q(1756511421, "INSERT OR REPLACE INTO DbQtNameSkip (id, word, createAt, updateAt)\nVALUES (?, ?, ?, ?)", new bo2(ap2Var, 16));
        C(1756511421, new yo2(3));
    }
}
