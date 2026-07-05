package defpackage;

import java.io.IOException;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m0e  reason: default package */
/* loaded from: classes.dex */
public abstract class m0e implements Cloneable {
    public final o0e a;
    public o0e b;

    public m0e(o0e o0eVar) {
        this.a = o0eVar;
        if (!o0eVar.g()) {
            this.b = o0eVar.i();
        } else {
            vs.m("Default instance must be immutable.");
            throw null;
        }
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i) {
                list.remove(size2);
            } else {
                throw new NullPointerException(sb2);
            }
        }
    }

    public final void b() {
        if (!this.b.g()) {
            o0e i = this.a.i();
            i2e.c.a(i.getClass()).a(i, this.b);
            this.b = i;
        }
    }

    /* renamed from: c */
    public final m0e clone() {
        m0e m0eVar = (m0e) this.a.s(5);
        boolean g = this.b.g();
        o0e o0eVar = this.b;
        if (g) {
            o0eVar.getClass();
            i2e.c.a(o0eVar.getClass()).c(o0eVar);
            o0eVar.h();
            o0eVar = this.b;
        }
        m0eVar.b = o0eVar;
        return m0eVar;
    }

    public final o0e d() {
        boolean g = this.b.g();
        o0e o0eVar = this.b;
        if (g) {
            o0eVar.getClass();
            i2e.c.a(o0eVar.getClass()).c(o0eVar);
            o0eVar.h();
            o0eVar = this.b;
        }
        o0eVar.getClass();
        if (o0e.q(o0eVar, true)) {
            return o0eVar;
        }
        throw new s2e();
    }

    public final void e(o0e o0eVar) {
        o0e o0eVar2 = this.a;
        if (!o0eVar2.equals(o0eVar)) {
            if (!this.b.g()) {
                o0e i = o0eVar2.i();
                i2e.c.a(i.getClass()).a(i, this.b);
                this.b = i;
            }
            o0e o0eVar3 = this.b;
            i2e.c.a(o0eVar3.getClass()).a(o0eVar3, o0eVar);
        }
    }

    public final void f(byte[] bArr, int i, h0e h0eVar) {
        if (!this.b.g()) {
            o0e i2 = this.a.i();
            i2e.c.a(i2.getClass()).a(i2, this.b);
            this.b = i2;
        }
        try {
            i2e.c.a(this.b.getClass()).e(this.b, bArr, 0, i, new lzd(h0eVar));
        } catch (i1e e) {
            throw e;
        } catch (IOException e2) {
            cp8.p("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
