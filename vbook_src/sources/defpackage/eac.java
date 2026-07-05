package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eac  reason: default package */
/* loaded from: classes.dex */
public final class eac extends CancellationException implements c72 {
    public final transient w26 a;

    public eac(String str, w26 w26Var) {
        super(str);
        this.a = w26Var;
    }

    @Override // defpackage.c72
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        eac eacVar = new eac(message, this.a);
        eacVar.initCause(this);
        return eacVar;
    }
}
