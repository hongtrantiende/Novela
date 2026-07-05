package defpackage;

import android.text.TextUtils;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wef  reason: default package */
/* loaded from: classes.dex */
public final class wef {
    public final mm9 a;
    public final mm9 b;
    public final UUID c;

    public wef(mm9 mm9Var, mm9 mm9Var2, UUID uuid) {
        this.a = mm9Var;
        this.b = mm9Var2;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wef) {
            wef wefVar = (wef) obj;
            if (this.a.equals(wefVar.a) && this.b.equals(wefVar.b) && this.c.equals(wefVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }
}
