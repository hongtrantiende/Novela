package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cqa  reason: default package */
/* loaded from: classes.dex */
public final class cqa implements rx1, Iterable, j76 {
    public final bqa a;
    public final int b;
    public final int c;

    public cqa(bqa bqaVar, int i, int i2) {
        this.a = bqaVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqa) {
            cqa cqaVar = (cqa) obj;
            if (cqaVar.b == this.b && cqaVar.c == this.c && cqaVar.a == this.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        bqa bqaVar = this.a;
        if (bqaVar.D != this.c) {
            dqa.f();
        }
        int i = this.b;
        bqaVar.h(i);
        return new s25(bqaVar, i + 1, bqaVar.a[(i * 5) + 3] + i);
    }
}
