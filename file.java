

    private void OnDisable()
    {
        if (UDPConnection.Instance != null)
            UDPConnection.Instance.UDPMessageReceivedEvent -= HandleUDPMessage;
    }



