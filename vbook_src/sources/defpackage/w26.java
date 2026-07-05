package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w26  reason: default package */
/* loaded from: classes3.dex */
public interface w26 extends b82 {
    xg1 attachChild(ah1 ah1Var);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    b9a getChildren();

    kb3 invokeOnCompletion(xt4 xt4Var);

    kb3 invokeOnCompletion(boolean z, boolean z2, xt4 xt4Var);

    boolean isActive();

    boolean isCancelled();

    Object join(m42 m42Var);

    boolean start();
}
