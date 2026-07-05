package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dk2  reason: default package */
/* loaded from: classes3.dex */
public final class dk2 extends pf9 {
    public final /* synthetic */ int b = 4;
    public final Object c;
    public final /* synthetic */ c3e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(lm2 lm2Var, String str, yo2 yo2Var) {
        super(yo2Var);
        str.getClass();
        this.d = lm2Var;
        this.c = str;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.d;
        switch (i) {
            case 0:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbAiTtsModel"}, pl4Var);
                return;
            case 1:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbBook"}, pl4Var);
                return;
            case 2:
                ((mm) ((lm2) c3eVar).a).o(new String[]{"DbEmoji"}, pl4Var);
                return;
            case 3:
                ((mm) ((lm2) c3eVar).a).o(new String[]{"DbExtensionLocalStorage"}, pl4Var);
                return;
            case 4:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbPage"}, pl4Var);
                return;
            default:
                ((mm) ((lm2) c3eVar).a).o(new String[]{"DbTTSWord"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        c3e c3eVar = this.d;
        switch (i) {
            case 0:
                return ((mm) ((gk2) c3eVar).a).G(-436292405, "SELECT DbAiTtsModel.id, DbAiTtsModel.name, DbAiTtsModel.language, DbAiTtsModel.sampleRate, DbAiTtsModel.numSpeakers, DbAiTtsModel.speakers, DbAiTtsModel.sizeBytes, DbAiTtsModel.gender, DbAiTtsModel.modelType, DbAiTtsModel.modelFormat, DbAiTtsModel.createAt, DbAiTtsModel.updateAt\nFROM DbAiTtsModel\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new u0(this, 20));
            case 1:
                gk2 gk2Var = (gk2) c3eVar;
                List list = (List) this.c;
                String Y = gk2.Y(gk2Var, list.size());
                return ((mm) gk2Var.a).G(null, l4b.z("\n          |SELECT COUNT(*)\n          |FROM DbBook\n          |WHERE format IN " + Y + " AND location = 1\n          "), xt4Var, list.size(), new k0(28, this, gk2Var));
            case 2:
                return ((mm) ((lm2) c3eVar).a).G(1453774010, "SELECT DbEmoji.id, DbEmoji.category, DbEmoji.url, DbEmoji.lastUse\nFROM DbEmoji\nWHERE category = ?", xt4Var, 1, new al2(this, 25));
            case 3:
                return ((mm) ((lm2) c3eVar).a).G(-1925663829, "SELECT DbExtensionLocalStorage.id, DbExtensionLocalStorage.extensionId, DbExtensionLocalStorage.key, DbExtensionLocalStorage.content FROM DbExtensionLocalStorage\nWHERE extensionId = ?", xt4Var, 1, new al2(this, 28));
            case 4:
                return ((mm) ((gk2) c3eVar).a).G(-208212790, "SELECT DbPage.id, DbPage.bookId, DbPage.position, DbPage.path, DbPage.createAt, DbPage.updateAt\nFROM DbPage\nWHERE bookId = ?\nORDER BY position ASC", xt4Var, 1, new bo2(this, 14));
            default:
                return ((mm) ((lm2) c3eVar).a).G(1406826892, "SELECT DbTTSWord.id, DbTTSWord.word, DbTTSWord.replace, DbTTSWord.ignoreCase, DbTTSWord.createAt, DbTTSWord.updateAt\nFROM DbTTSWord\nWHERE word = ?\nLIMIT 1", xt4Var, 1, new bo2(this, 25));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbAiTtsModel"}, pl4Var);
                return;
            case 1:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbBook"}, pl4Var);
                return;
            case 2:
                ((mm) ((lm2) c3eVar).a).V(new String[]{"DbEmoji"}, pl4Var);
                return;
            case 3:
                ((mm) ((lm2) c3eVar).a).V(new String[]{"DbExtensionLocalStorage"}, pl4Var);
                return;
            case 4:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbPage"}, pl4Var);
                return;
            default:
                ((mm) ((lm2) c3eVar).a).V(new String[]{"DbTTSWord"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbAiTtsModel.sq:get";
            case 1:
                return "DbBook.sq:countByShelfFormats";
            case 2:
                return "DbEmoji.sq:getEmojiByCategory";
            case 3:
                return "DbExtensionLocalStorage.sq:getByExtensionId";
            case 4:
                return "DbPage.sq:getPages";
            default:
                return "DbTTSWord.sq:getByName";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(gk2 gk2Var, String str, ck2 ck2Var) {
        super(ck2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(lm2 lm2Var, String str, hn2 hn2Var) {
        super(hn2Var);
        str.getClass();
        this.d = lm2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(lm2 lm2Var, String str, hn2 hn2Var, byte b) {
        super(hn2Var);
        str.getClass();
        this.d = lm2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(gk2 gk2Var, String str, bo2 bo2Var) {
        super(bo2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(gk2 gk2Var, List list, bk2 bk2Var) {
        super(bk2Var);
        this.d = gk2Var;
        this.c = list;
    }
}
