package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bjc  reason: default package */
/* loaded from: classes.dex */
public final class bjc {
    public static final bjc d = new bjc(new ajc[0]);
    public final int a;
    public final mm9 b;
    public int c;

    static {
        a2d.K(0);
    }

    public bjc(ajc... ajcVarArr) {
        mm9 m = qs5.m(ajcVarArr);
        this.b = m;
        this.a = ajcVarArr.length;
        int i = 0;
        while (i < m.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < m.d; i3++) {
                if (((ajc) m.get(i)).equals(m.get(i3))) {
                    st0.i("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final ajc a(int i) {
        return (ajc) this.b.get(i);
    }

    public final int b(ajc ajcVar) {
        int indexOf = this.b.indexOf(ajcVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && bjc.class == obj.getClass()) {
                bjc bjcVar = (bjc) obj;
                if (this.a == bjcVar.a && this.b.equals(bjcVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
