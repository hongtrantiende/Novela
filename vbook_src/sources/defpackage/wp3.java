package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wp3  reason: default package */
/* loaded from: classes3.dex */
public final class wp3 {
    public final String a;
    public final String b;
    public final int c;
    public final List d;

    public wp3(int i, String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp3)) {
            return false;
        }
        wp3 wp3Var = (wp3) obj;
        if (c16.i(this.a, wp3Var.a) && c16.i(this.b, wp3Var.b) && this.c == wp3Var.c && c16.i(this.d, wp3Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("EmojiCategory(id=", this.a, ", thumb=", this.b, ", count=");
        y.append(this.c);
        y.append(", emojiList=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
