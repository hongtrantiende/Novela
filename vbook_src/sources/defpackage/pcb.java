package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: pcb  reason: default package */
/* loaded from: classes3.dex */
public final class pcb {
    public static final ocb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ pcb(String str, int i, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcb)) {
            return false;
        }
        pcb pcbVar = (pcb) obj;
        if (c16.i(this.a, pcbVar.a) && c16.i(this.b, pcbVar.b) && c16.i(this.c, pcbVar.c) && c16.i(this.d, pcbVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nk2.w(nk2.y("SyncExtensionLocalStorage(id=", this.a, ", extensionId=", this.b, ", key="), this.c, ", content=", this.d, ")");
    }

    public pcb(String str, String str2, String str3, String str4) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
