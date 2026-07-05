package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cd  reason: default package */
/* loaded from: classes.dex */
public final class cd {
    public final long a;
    public final aac b;
    public final int c;
    public final e67 d;
    public final long e;
    public final aac f;
    public final int g;
    public final e67 h;
    public final long i;
    public final long j;

    public cd(long j, aac aacVar, int i, e67 e67Var, long j2, aac aacVar2, int i2, e67 e67Var2, long j3, long j4) {
        this.a = j;
        this.b = aacVar;
        this.c = i;
        this.d = e67Var;
        this.e = j2;
        this.f = aacVar2;
        this.g = i2;
        this.h = e67Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && cd.class == obj.getClass()) {
                cd cdVar = (cd) obj;
                if (this.a == cdVar.a && this.c == cdVar.c && this.e == cdVar.e && this.g == cdVar.g && this.i == cdVar.i && this.j == cdVar.j && this.b.equals(cdVar.b) && Objects.equals(this.d, cdVar.d) && Objects.equals(this.f, cdVar.f) && Objects.equals(this.h, cdVar.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
