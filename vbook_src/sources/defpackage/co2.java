package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: co2  reason: default package */
/* loaded from: classes3.dex */
public final class co2 extends pf9 {
    public final /* synthetic */ int b;
    public final String c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co2(gk2 gk2Var, String str, zn2 zn2Var) {
        super(zn2Var);
        this.b = 1;
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                ((mm) gk2Var.a).o(new String[]{"DbExtension"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).o(new String[]{"DbExtension"}, pl4Var);
                return;
            case 2:
                ((mm) gk2Var.a).o(new String[]{"DbExtension"}, pl4Var);
                return;
            case 3:
                ((mm) gk2Var.a).o(new String[]{"DbExtension"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).o(new String[]{"DbExtension"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(1628020592, "SELECT icon\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new bo2(this, 0));
            case 1:
                return ((mm) gk2Var.a).G(1129376456, "SELECT DbExtension.id, DbExtension.name, DbExtension.author, DbExtension.version, DbExtension.source, DbExtension.path, DbExtension.regex, DbExtension.icon, DbExtension.description, DbExtension.language, DbExtension.type, DbExtension.nsfw, DbExtension.development, DbExtension.draft, DbExtension.encrypt, DbExtension.scriptMetadata, DbExtension.settingMetadata, DbExtension.scriptData, DbExtension.settingData, DbExtension.translateData, DbExtension.pinedAt, DbExtension.lastUse, DbExtension.createAt, DbExtension.updateAt\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new bo2(this, 1));
            case 2:
                return ((mm) gk2Var.a).G(1253800498, "SELECT settingData\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new bo2(this, 2));
            case 3:
                return ((mm) gk2Var.a).G(-1444838985, "SELECT settingMetadata\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new bo2(this, 3));
            default:
                return ((mm) gk2Var.a).G(623642672, "SELECT translateData\nFROM DbExtension\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new bo2(this, 4));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbExtension"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).V(new String[]{"DbExtension"}, pl4Var);
                return;
            case 2:
                ((mm) gk2Var.a).V(new String[]{"DbExtension"}, pl4Var);
                return;
            case 3:
                ((mm) gk2Var.a).V(new String[]{"DbExtension"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).V(new String[]{"DbExtension"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbExtension.sq:getExtensionIcon";
            case 1:
                return "DbExtension.sq:get";
            case 2:
                return "DbExtension.sq:getSettingData";
            case 3:
                return "DbExtension.sq:getSettingMetadata";
            default:
                return "DbExtension.sq:getTranslateData";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co2(gk2 gk2Var, String str, xt4 xt4Var, int i) {
        super(xt4Var);
        this.b = i;
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co2(gk2 gk2Var, String str, ao2 ao2Var) {
        super(ao2Var);
        this.b = 0;
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co2(gk2 gk2Var, String str, zn2 zn2Var, byte b) {
        super(zn2Var);
        this.b = 2;
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }
}
