package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eq5  reason: default package */
/* loaded from: classes3.dex */
public final class eq5 {
    public final String a = "";
    public final ArrayList b;

    public eq5(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eq5) {
                eq5 eq5Var = (eq5) obj;
                if (!this.a.equals(eq5Var.a) || !this.b.equals(eq5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageSourceChapterContent(title=" + this.a + ", images=" + this.b + ")";
    }
}
