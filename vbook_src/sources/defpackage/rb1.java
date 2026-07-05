package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rb1  reason: default package */
/* loaded from: classes3.dex */
public final class rb1 {
    public final int a;
    public final String b;
    public final ArrayList c;

    public rb1(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rb1) {
                rb1 rb1Var = (rb1) obj;
                if (this.a == rb1Var.a && this.c.size() == rb1Var.c.size()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a * 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("ChapterSearchContent(chapterIndex=", this.a, ", chapterName=", this.b, ", searchContents=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
}
