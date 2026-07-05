package defpackage;

import java.util.Set;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ayd  reason: default package */
/* loaded from: classes.dex */
public final class ayd extends c41 {
    public final Level c;
    public final Set d;
    public final dlf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayd(String str) {
        super(str, 4);
        Level level = Level.ALL;
        Set set = byd.g;
        this.c = level;
        this.d = byd.g;
        this.e = byd.h;
    }

    @Override // defpackage.c41
    public final boolean g(Level level) {
        return true;
    }

    @Override // defpackage.c41
    public final void h(pif pifVar) {
        String str = (String) pifVar.c().w(lkf.b);
        if (str == null) {
            str = this.b;
        }
        if (str == null) {
            ljf ljfVar = pifVar.d;
            if (ljfVar != null) {
                str = ljfVar.a();
                int indexOf = str.indexOf(36, str.lastIndexOf(46));
                if (indexOf >= 0) {
                    str = str.substring(0, indexOf);
                }
            } else {
                vs.k("cannot request log site information prior to postProcess()");
                return;
            }
        }
        byd.j(pifVar, q0f.s(str), this.c, this.d, this.e);
    }
}
