struct LIST
{
  struct LIST * pNext;
  int           iValue;
};

struct LIST * SortList(struct LIST * pList)
{
  // zero or one element in list
  if(!pList || !pList->pNext)
      return pList;

  /* build up the sorted array from the empty list */
  struct LIST * pSorted = NULL;

  /* take items off the input list one by one until empty */
  while (pList != NULL)
  {
      /* remember the head */
      struct LIST *   pHead  = pList;
      /* trailing pointer for efficient splice */
      struct LIST ** ppTrail = &pSorted;

      /* pop head off list */
      pList = pList->pNext;

      /* splice head into sorted list at proper place */
      while (!(*ppTrail == NULL || pHead->iValue < (*ppTrail)->iValue)) /* does head belong here? */
      {
          /* no - continue down the list */
          ppTrail = &(*ppTrail)->pNext;
      }

      pHead->pNext = *ppTrail;
      *ppTrail = pHead;
  }

  return pSorted;
}