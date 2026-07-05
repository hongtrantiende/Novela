package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: noa  reason: default package */
/* loaded from: classes3.dex */
public final class noa {
    public final String a;

    public /* synthetic */ noa(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return hl5.n("SlashCommandId(value=", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof noa) {
            if (!c16.i(this.a, ((noa) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
