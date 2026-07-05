package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x26  reason: default package */
/* loaded from: classes3.dex */
public final class x26 extends CancellationException implements c72 {
    public final transient w26 a;

    public x26(w26 w26Var, String str, Throwable th) {
        super(str);
        this.a = w26Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.c72
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof x26) {
                x26 x26Var = (x26) obj;
                if (c16.i(x26Var.getMessage(), getMessage())) {
                    Object obj2 = x26Var.a;
                    if (obj2 == null) {
                        obj2 = u38.b;
                    }
                    Object obj3 = this.a;
                    if (obj3 == null) {
                        obj3 = u38.b;
                    }
                    if (!c16.i(obj2, obj3) || !c16.i(x26Var.getCause(), getCause())) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.a;
        if (obj == null) {
            obj = u38.b;
        }
        int hashCode2 = (obj.hashCode() + hashCode) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode2 + i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.a;
        if (obj == null) {
            obj = u38.b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
