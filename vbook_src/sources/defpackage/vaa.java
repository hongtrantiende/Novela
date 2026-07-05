package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: vaa  reason: default package */
/* loaded from: classes.dex */
public final class vaa {
    public static final uaa Companion = new Object();
    public static final ye6[] d = {null, null, ipe.x(sk6.b, new zt9(23))};
    public final zaa a;
    public final f9c b;
    public final Map c;

    public /* synthetic */ vaa(int i, zaa zaaVar, f9c f9cVar, Map map) {
        if (1 == (i & 1)) {
            this.a = zaaVar;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = f9cVar;
            }
            if ((i & 4) == 0) {
                this.c = null;
                return;
            } else {
                this.c = map;
                return;
            }
        }
        w92.x(i, 1, taa.a.e());
        throw null;
    }

    public static vaa a(vaa vaaVar, zaa zaaVar, f9c f9cVar, Map map, int i) {
        if ((i & 1) != 0) {
            zaaVar = vaaVar.a;
        }
        if ((i & 2) != 0) {
            f9cVar = vaaVar.b;
        }
        if ((i & 4) != 0) {
            map = vaaVar.c;
        }
        vaaVar.getClass();
        zaaVar.getClass();
        return new vaa(zaaVar, f9cVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaa)) {
            return false;
        }
        vaa vaaVar = (vaa) obj;
        if (c16.i(this.a, vaaVar.a) && c16.i(this.b, vaaVar.b) && c16.i(this.c, vaaVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        f9c f9cVar = this.b;
        if (f9cVar == null) {
            hashCode = 0;
        } else {
            hashCode = Long.hashCode(f9cVar.a);
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Map map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public vaa(zaa zaaVar, f9c f9cVar, Map map) {
        zaaVar.getClass();
        this.a = zaaVar;
        this.b = f9cVar;
        this.c = map;
    }
}
