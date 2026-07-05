package com.google.ads.interactivemedia.v3.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class JavaScriptMessage$MsgType {
    private static final /* synthetic */ JavaScriptMessage$MsgType[] $VALUES;
    public static final JavaScriptMessage$MsgType activate;
    public static final JavaScriptMessage$MsgType adBreakEnded;
    public static final JavaScriptMessage$MsgType adBreakFetchError;
    public static final JavaScriptMessage$MsgType adBreakReady;
    public static final JavaScriptMessage$MsgType adBreakStarted;
    public static final JavaScriptMessage$MsgType adBuffering;
    public static final JavaScriptMessage$MsgType adCanPlay;
    public static final JavaScriptMessage$MsgType adMetadata;
    public static final JavaScriptMessage$MsgType adPeriodEnded;
    public static final JavaScriptMessage$MsgType adPeriodStarted;
    public static final JavaScriptMessage$MsgType adProgress;
    public static final JavaScriptMessage$MsgType adsLoaded;
    public static final JavaScriptMessage$MsgType allAdsCompleted;
    public static final JavaScriptMessage$MsgType appBackgrounding;
    public static final JavaScriptMessage$MsgType appForegrounding;
    public static final JavaScriptMessage$MsgType appStateChanged;
    public static final JavaScriptMessage$MsgType click;
    public static final JavaScriptMessage$MsgType clickSignalRequest;
    public static final JavaScriptMessage$MsgType clickSignalResponse;
    public static final JavaScriptMessage$MsgType companionView;
    public static final JavaScriptMessage$MsgType complete;
    public static final JavaScriptMessage$MsgType contentComplete;
    public static final JavaScriptMessage$MsgType contentPauseRequested;
    public static final JavaScriptMessage$MsgType contentResumeRequested;
    public static final JavaScriptMessage$MsgType contentTimeUpdate;
    public static final JavaScriptMessage$MsgType csi;
    public static final JavaScriptMessage$MsgType cuepointsChanged;
    public static final JavaScriptMessage$MsgType destroy;
    public static final JavaScriptMessage$MsgType discardAdBreak;
    public static final JavaScriptMessage$MsgType displayCompanions;
    public static final JavaScriptMessage$MsgType displayPauseAd;
    public static final JavaScriptMessage$MsgType durationChange;
    public static final JavaScriptMessage$MsgType end;
    public static final JavaScriptMessage$MsgType error;
    public static final JavaScriptMessage$MsgType firstquartile;
    public static final JavaScriptMessage$MsgType focusUiElement;
    public static final JavaScriptMessage$MsgType forwardCompatibleUnload;
    public static final JavaScriptMessage$MsgType getViewability;
    public static final JavaScriptMessage$MsgType hide;
    public static final JavaScriptMessage$MsgType hideAdUi;
    public static final JavaScriptMessage$MsgType hidePauseAd;
    public static final JavaScriptMessage$MsgType iconClicked;
    public static final JavaScriptMessage$MsgType iconFallbackImageClosed;
    public static final JavaScriptMessage$MsgType iconRendered;
    public static final JavaScriptMessage$MsgType impression;
    public static final JavaScriptMessage$MsgType init;
    public static final JavaScriptMessage$MsgType initialized;
    public static final JavaScriptMessage$MsgType isDestroyed;
    public static final JavaScriptMessage$MsgType load;
    public static final JavaScriptMessage$MsgType loadStream;
    public static final JavaScriptMessage$MsgType loadStreamMetadata;
    public static final JavaScriptMessage$MsgType loaded;
    public static final JavaScriptMessage$MsgType log;
    public static final JavaScriptMessage$MsgType midpoint;
    public static final JavaScriptMessage$MsgType mute;
    public static final JavaScriptMessage$MsgType nativeInstrumentation;
    public static final JavaScriptMessage$MsgType nativeRequest;
    public static final JavaScriptMessage$MsgType nativeResponse;
    public static final JavaScriptMessage$MsgType navigationRequested;
    public static final JavaScriptMessage$MsgType navigationRequestedFailed;
    public static final JavaScriptMessage$MsgType omidReady;
    public static final JavaScriptMessage$MsgType omidUnavailable;
    public static final JavaScriptMessage$MsgType onClick;
    public static final JavaScriptMessage$MsgType pause;
    public static final JavaScriptMessage$MsgType pauseAdClick;
    public static final JavaScriptMessage$MsgType pauseAdReady;
    public static final JavaScriptMessage$MsgType pauseAdView;
    public static final JavaScriptMessage$MsgType play;
    public static final JavaScriptMessage$MsgType registerFriendlyObstructions;
    public static final JavaScriptMessage$MsgType replaceAdTagParameters;
    public static final JavaScriptMessage$MsgType requestAds;
    public static final JavaScriptMessage$MsgType requestNextAdBreak;
    public static final JavaScriptMessage$MsgType requestStream;
    public static final JavaScriptMessage$MsgType resizeAndPositionVideo;
    public static final JavaScriptMessage$MsgType restoreSizeAndPositionVideo;
    public static final JavaScriptMessage$MsgType resume;
    public static final JavaScriptMessage$MsgType setVisibleUiElements;
    public static final JavaScriptMessage$MsgType showAdUi;
    public static final JavaScriptMessage$MsgType showVideo;
    public static final JavaScriptMessage$MsgType skip;
    public static final JavaScriptMessage$MsgType skippableStateChanged;
    public static final JavaScriptMessage$MsgType start;
    public static final JavaScriptMessage$MsgType startStream;
    public static final JavaScriptMessage$MsgType startTracking;
    public static final JavaScriptMessage$MsgType stopTracking;
    public static final JavaScriptMessage$MsgType streamInitialized;
    public static final JavaScriptMessage$MsgType streamRequestComplete;
    public static final JavaScriptMessage$MsgType thirdquartile;
    public static final JavaScriptMessage$MsgType timedMetadata;
    public static final JavaScriptMessage$MsgType timeupdate;
    public static final JavaScriptMessage$MsgType unload;
    public static final JavaScriptMessage$MsgType unmute;
    public static final JavaScriptMessage$MsgType updateUiState;
    public static final JavaScriptMessage$MsgType videoClicked;
    public static final JavaScriptMessage$MsgType videoIconClicked;
    public static final JavaScriptMessage$MsgType viewSignalRequest;
    public static final JavaScriptMessage$MsgType viewSignalResponse;
    public static final JavaScriptMessage$MsgType viewability;
    public static final JavaScriptMessage$MsgType volumeChange;
    public static final JavaScriptMessage$MsgType waiting;
    public static final JavaScriptMessage$MsgType webViewNavigationDetected;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType] */
    static {
        ?? r1 = new Enum("activate", 0);
        activate = r1;
        ?? r2 = new Enum("adBreakEnded", 1);
        adBreakEnded = r2;
        ?? r3 = new Enum("adBreakFetchError", 2);
        adBreakFetchError = r3;
        ?? r4 = new Enum("adBreakReady", 3);
        adBreakReady = r4;
        ?? r5 = new Enum("adBreakStarted", 4);
        adBreakStarted = r5;
        ?? r6 = new Enum("adBuffering", 5);
        adBuffering = r6;
        ?? r7 = new Enum("adCanPlay", 6);
        adCanPlay = r7;
        ?? r8 = new Enum("adMetadata", 7);
        adMetadata = r8;
        ?? r9 = new Enum("adPeriodEnded", 8);
        adPeriodEnded = r9;
        ?? r10 = new Enum("adPeriodStarted", 9);
        adPeriodStarted = r10;
        ?? r11 = new Enum("adProgress", 10);
        adProgress = r11;
        ?? r12 = new Enum("adsLoaded", 11);
        adsLoaded = r12;
        ?? r13 = new Enum("allAdsCompleted", 12);
        allAdsCompleted = r13;
        ?? r14 = new Enum("appBackgrounding", 13);
        appBackgrounding = r14;
        ?? r15 = new Enum("appForegrounding", 14);
        appForegrounding = r15;
        ?? r0 = new Enum("appStateChanged", 15);
        appStateChanged = r0;
        ?? r16 = new Enum("click", 16);
        click = r16;
        ?? r02 = new Enum("clickSignalRequest", 17);
        clickSignalRequest = r02;
        ?? r17 = new Enum("clickSignalResponse", 18);
        clickSignalResponse = r17;
        ?? r03 = new Enum("companionView", 19);
        companionView = r03;
        ?? r18 = new Enum("complete", 20);
        complete = r18;
        ?? r04 = new Enum("contentComplete", 21);
        contentComplete = r04;
        ?? r19 = new Enum("contentPauseRequested", 22);
        contentPauseRequested = r19;
        ?? r05 = new Enum("contentResumeRequested", 23);
        contentResumeRequested = r05;
        ?? r110 = new Enum("contentTimeUpdate", 24);
        contentTimeUpdate = r110;
        ?? r06 = new Enum("csi", 25);
        csi = r06;
        ?? r111 = new Enum("cuepointsChanged", 26);
        cuepointsChanged = r111;
        ?? r07 = new Enum("destroy", 27);
        destroy = r07;
        ?? r112 = new Enum("discardAdBreak", 28);
        discardAdBreak = r112;
        ?? r08 = new Enum("displayCompanions", 29);
        displayCompanions = r08;
        ?? r113 = new Enum("displayPauseAd", 30);
        displayPauseAd = r113;
        ?? r09 = new Enum("durationChange", 31);
        durationChange = r09;
        ?? r114 = new Enum("end", 32);
        end = r114;
        ?? r010 = new Enum("error", 33);
        error = r010;
        ?? r115 = new Enum("firstquartile", 34);
        firstquartile = r115;
        ?? r011 = new Enum("focusUiElement", 35);
        focusUiElement = r011;
        ?? r116 = new Enum("forwardCompatibleUnload", 36);
        forwardCompatibleUnload = r116;
        ?? r012 = new Enum("getViewability", 37);
        getViewability = r012;
        ?? r117 = new Enum("hide", 38);
        hide = r117;
        ?? r013 = new Enum("hideAdUi", 39);
        hideAdUi = r013;
        ?? r118 = new Enum("hidePauseAd", 40);
        hidePauseAd = r118;
        ?? r014 = new Enum("iconClicked", 41);
        iconClicked = r014;
        ?? r119 = new Enum("iconFallbackImageClosed", 42);
        iconFallbackImageClosed = r119;
        ?? r015 = new Enum("iconRendered", 43);
        iconRendered = r015;
        ?? r120 = new Enum("impression", 44);
        impression = r120;
        ?? r016 = new Enum("init", 45);
        init = r016;
        ?? r121 = new Enum("initialized", 46);
        initialized = r121;
        ?? r017 = new Enum("isDestroyed", 47);
        isDestroyed = r017;
        ?? r122 = new Enum("load", 48);
        load = r122;
        ?? r018 = new Enum("loadStream", 49);
        loadStream = r018;
        ?? r123 = new Enum("loadStreamMetadata", 50);
        loadStreamMetadata = r123;
        ?? r019 = new Enum("loaded", 51);
        loaded = r019;
        ?? r124 = new Enum("log", 52);
        log = r124;
        ?? r020 = new Enum("midpoint", 53);
        midpoint = r020;
        ?? r125 = new Enum("mute", 54);
        mute = r125;
        ?? r021 = new Enum("nativeInstrumentation", 55);
        nativeInstrumentation = r021;
        ?? r126 = new Enum("nativeRequest", 56);
        nativeRequest = r126;
        ?? r022 = new Enum("nativeResponse", 57);
        nativeResponse = r022;
        ?? r127 = new Enum("navigationRequested", 58);
        navigationRequested = r127;
        ?? r023 = new Enum("navigationRequestedFailed", 59);
        navigationRequestedFailed = r023;
        ?? r128 = new Enum("omidReady", 60);
        omidReady = r128;
        ?? r024 = new Enum("omidUnavailable", 61);
        omidUnavailable = r024;
        ?? r129 = new Enum("onClick", 62);
        onClick = r129;
        ?? r025 = new Enum("pause", 63);
        pause = r025;
        ?? r130 = new Enum("pauseAdClick", 64);
        pauseAdClick = r130;
        ?? r026 = new Enum("pauseAdReady", 65);
        pauseAdReady = r026;
        ?? r131 = new Enum("pauseAdView", 66);
        pauseAdView = r131;
        ?? r027 = new Enum("play", 67);
        play = r027;
        ?? r132 = new Enum("registerFriendlyObstructions", 68);
        registerFriendlyObstructions = r132;
        ?? r028 = new Enum("replaceAdTagParameters", 69);
        replaceAdTagParameters = r028;
        ?? r133 = new Enum("requestAds", 70);
        requestAds = r133;
        ?? r029 = new Enum("requestNextAdBreak", 71);
        requestNextAdBreak = r029;
        ?? r134 = new Enum("requestStream", 72);
        requestStream = r134;
        ?? r030 = new Enum("resizeAndPositionVideo", 73);
        resizeAndPositionVideo = r030;
        ?? r135 = new Enum("restoreSizeAndPositionVideo", 74);
        restoreSizeAndPositionVideo = r135;
        ?? r031 = new Enum("resume", 75);
        resume = r031;
        ?? r136 = new Enum("setVisibleUiElements", 76);
        setVisibleUiElements = r136;
        ?? r032 = new Enum("showAdUi", 77);
        showAdUi = r032;
        ?? r137 = new Enum("showVideo", 78);
        showVideo = r137;
        ?? r033 = new Enum("skip", 79);
        skip = r033;
        ?? r138 = new Enum("skippableStateChanged", 80);
        skippableStateChanged = r138;
        ?? r034 = new Enum("start", 81);
        start = r034;
        ?? r139 = new Enum("startStream", 82);
        startStream = r139;
        ?? r035 = new Enum("startTracking", 83);
        startTracking = r035;
        ?? r140 = new Enum("stopTracking", 84);
        stopTracking = r140;
        ?? r036 = new Enum("streamInitialized", 85);
        streamInitialized = r036;
        ?? r141 = new Enum("streamRequestComplete", 86);
        streamRequestComplete = r141;
        ?? r037 = new Enum("thirdquartile", 87);
        thirdquartile = r037;
        ?? r142 = new Enum("timedMetadata", 88);
        timedMetadata = r142;
        ?? r038 = new Enum("timeupdate", 89);
        timeupdate = r038;
        ?? r143 = new Enum("unload", 90);
        unload = r143;
        ?? r039 = new Enum("unmute", 91);
        unmute = r039;
        ?? r144 = new Enum("updateUiState", 92);
        updateUiState = r144;
        ?? r040 = new Enum("videoClicked", 93);
        videoClicked = r040;
        ?? r145 = new Enum("videoIconClicked", 94);
        videoIconClicked = r145;
        ?? r041 = new Enum("viewSignalRequest", 95);
        viewSignalRequest = r041;
        ?? r146 = new Enum("viewSignalResponse", 96);
        viewSignalResponse = r146;
        ?? r042 = new Enum("viewability", 97);
        viewability = r042;
        ?? r147 = new Enum("volumeChange", 98);
        volumeChange = r147;
        ?? r043 = new Enum("waiting", 99);
        waiting = r043;
        ?? r148 = new Enum("webViewNavigationDetected", 100);
        webViewNavigationDetected = r148;
        $VALUES = new JavaScriptMessage$MsgType[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r16, r02, r17, r03, r18, r04, r19, r05, r110, r06, r111, r07, r112, r08, r113, r09, r114, r010, r115, r011, r116, r012, r117, r013, r118, r014, r119, r015, r120, r016, r121, r017, r122, r018, r123, r019, r124, r020, r125, r021, r126, r022, r127, r023, r128, r024, r129, r025, r130, r026, r131, r027, r132, r028, r133, r029, r134, r030, r135, r031, r136, r032, r137, r033, r138, r034, r139, r035, r140, r036, r141, r037, r142, r038, r143, r039, r144, r040, r145, r041, r146, r042, r147, r043, r148};
    }

    public static JavaScriptMessage$MsgType[] values() {
        return (JavaScriptMessage$MsgType[]) $VALUES.clone();
    }
}
